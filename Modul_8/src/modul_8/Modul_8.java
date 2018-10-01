/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_8;

import java.util.Scanner;
import opgave93.opg93;
import opgave98.opg98;

/**
 *
 * @author Noob
 */
public class Modul_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        opg93 op93 = new opg93();
        opg98 op98 = new opg98();

        while (run) {
            System.out.println("Chose an assignments:");
            String choseAssignments = input.next();

            switch (choseAssignments) {
                case "opg93":
                    op93.run();
                    run = false;
                    break;
                case "opg98":
                    op98.run();
                    run = false;
                    break;
                case "opg99":
                    op93.run();
                    run = false;
                    break;
                case "q":
                    run = false;
                default:
                    System.out.println("Not an assignments try again");
            }

        }
    }

}
