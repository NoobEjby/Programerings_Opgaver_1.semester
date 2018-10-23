/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg13;

import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author Noob
 */
public class Modul13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean running = true;

        int line;
        String update;

        Opgave1 op1 = new Opgave1();

        EOpgaver eop = new EOpgaver();

//        op1.run();
        eop.run();

        while (running) {

            System.out.println("Remove or Add a line?");
            String ra = input.next();
            switch (ra) {
                case "Remove":
                case "remove":
                    System.out.println("Witch line?");
                    line = input.nextInt();
                    eop.remove(line);
                    break;
                case "Add":
                case "add":
                    System.out.println("witch line would you like to move");
                    line = input.nextInt();
                    if (line > eop.elements) {
                        line = eop.elements + 1;
                    }
                    System.out.println("What would you like to write?");
                    update = input.next();
                    System.out.println(line);
                    eop.add(line, update);
                    break;
                default:
                    running = false;
                    break;
            }
            System.out.println("");
            eop.scanRead();

        }
    }

}
