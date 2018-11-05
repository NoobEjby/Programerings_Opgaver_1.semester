/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_15_bog;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Noob
 */
public class Modul_15_bog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean run = true;
        int month;

        while (run) {

            try {
                System.out.println("Cohse number betwen 1-12");

                month = input.nextInt();

                System.out.println(months[month - 1]);
                run = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a month number");
            }catch (InputMismatchException e) {
                System.out.println("Not a number");
                input.next();
            }
    }
}

}
