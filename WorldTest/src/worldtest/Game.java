package worldtest;

import SDUVejviser.RoomNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Parser parser;
    private Room currentRoom;

    public Game() throws RoomNotFoundException {
        createRooms();
        parser = new Parser();
    }

    private void createRooms() throws RoomNotFoundException {
//        Loading file placement
        File roomFile = new File("src/resources/Rooms.csv");

//        Creating scanner
        Scanner reader;

//        Creating arraylist of rooms
        ArrayList<Room> rooms = new ArrayList<>();

//        
        boolean allRooms = false;

//        Placeholder for Room descriptions an Exits
        String updateRooms;
        int updateExit;

//        Exit names (0,1,2,3)
        String[] exits = {"north", "south", "east", "west", "up", "down"};

        try {
//            Read from file
            reader = new Scanner(roomFile).useDelimiter(";");

//            Creating all rooms
            while (!allRooms) {

//                Room descriptions loaded
                updateRooms = reader.next();

//                If null is found all rooms are created
                if (!"null".equals(updateRooms)) {
                    rooms.add(new Room(updateRooms));
                } else {
                    allRooms = true;

                }

            }

//            Creating exits to rooms
            for (int i = 0; i < 4; i++) {

//                Reading next line in file
                reader.nextLine();
                for (int j = 0; j < rooms.size(); j++) {

//                    Reading room exit (0,1,2,3)
                    updateExit = reader.nextInt();

//                    If room exit equels -1 not an exit
                    if (updateExit >= 0) {
                        rooms.get(j).setExit(exits[i], rooms.get(updateExit));

                    }
                }
            }
//            close file
            reader.close();
            //        Starting room
            currentRoom = rooms.get(0);
        } catch (FileNotFoundException ex) {
            throw new RoomNotFoundException(roomFile);
        }

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
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
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
