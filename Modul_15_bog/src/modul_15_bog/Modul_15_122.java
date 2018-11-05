package modul_15_bog;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Noob
 */
public class Modul_15_122 {

    Scanner input = new Scanner(System.in);

    String[] months = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October",
        "November", "December"};
    int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    boolean run = true;
    int month;

    public Modul_15_122() {

        while (run) {
            for (int i = 0; i < 1; i++) {
                try {
                    System.out.println("Cohse number betwen 1-12");

                    month = input.nextInt();
                } catch (Exception e) {
                    i = 0;
                }

            }

            try {
                System.out.println(months[month - 1]);
                run = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a month number");
            }
        }
    }

}
