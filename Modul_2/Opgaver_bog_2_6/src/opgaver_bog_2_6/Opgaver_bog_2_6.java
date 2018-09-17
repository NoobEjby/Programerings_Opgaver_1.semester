/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver_bog_2_6;

/**
 *
 * @author Noob
 */
public class Opgaver_bog_2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input
        int number = 473;

        int first_diget = number / 100;
        int second_diget = (number / 10) % 10;
        int thirt_diget = number % 10;
        int multiply = first_diget * second_diget * thirt_diget;
        System.out.println("The multiplication of all diget in " + number + " is " + multiply);
    }

}
