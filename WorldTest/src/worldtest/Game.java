
package worldtest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Parser parser;
    private Room currentRoom;

    public Game() {
        createRooms();
        parser = new Parser();
    }

    private void createRooms() {
        
        File roomFile = new File("src/resources/Rooms.csv");
        
        Scanner reader;

        ArrayList<Room> rooms = new ArrayList<>();

        boolean allRooms = false;

        String update;
        int updatExit;

        String[] exits = {"north", "south", "east", "west"};

        try {
            reader = new Scanner(roomFile).useDelimiter(";");
            while (!allRooms) {

                update = reader.next();
                if (!"null".equals(update)) {
                    rooms.add(new Room(update));
                } else {
                    allRooms = true;
                    
                }

            }

            for (int i = 0; i < 4; i++) {
                reader.nextLine();
                for (int j = 0; j < rooms.size(); j++) {

                    updatExit = reader.nextInt();
                    if (updatExit != -1) {
                        rooms.get(j).setExit(exits[i], rooms.get(updatExit));

                    }
                }
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        currentRoom = rooms.get(0);
    }

    public void play() {
        printWelcome();

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the SDU!");
        System.out.println("SDU is a new, incredibly boring place.");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        if (commandWord == CommandWord.UNKNOWN) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        if (commandWord == CommandWord.HELP) {
            printHelp();
        } else if (commandWord == CommandWord.GO) {
            goRoom(command);
        } else if (commandWord == CommandWord.QUIT) {
            wantToQuit = quit(command);
        }
        return wantToQuit;
    }

    private void printHelp() {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true;
        }
    }
}
