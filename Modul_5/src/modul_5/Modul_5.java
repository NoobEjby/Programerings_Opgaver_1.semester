/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_5;

import java.util.Scanner;
import javafx.scene.input.KeyCode;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author Noob
 */
public class Modul_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        opg625();
    }

    public static void opg62() {
        Scanner input = new Scanner(System.in);

        System.out.print("input number:");
        long number = input.nextLong();
        System.out.println(sumDigits(number));

    }

    public static int sumDigits(long n) {
        int addedNumbers = 0;
        int length = 0;
        int length1;
        for (boolean run = true; run;) {

            length++;
            length1 = (int) Math.pow(10, length);

            if (n < length1) {
                run = false;
            }
        }
        for (int i = 0; i < length; i++) {
            int nDiv = (int) ((int) n / Math.pow(10, i));
            addedNumbers += nDiv % 10;
        }
        return addedNumbers;
    }
    
    
    
    
    
    
    
    

    public static void opg63() {
        Scanner input = new Scanner(System.in);

        System.out.print("input number:");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }

    // Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number) {
        int addedNumbers = 0;
        int length = 0;
        int length1;
        for (boolean run = true; run;) {

            length++;
            length1 = (int) Math.pow(10, length);

            if (number < length1) {
                run = false;
            }
        }
        for (int i = 0; i < length; i++) {
            int nDiv = (int) ((int) number / Math.pow(10, i));
            addedNumbers += (nDiv % 10) * (Math.pow(10, length - i - 1));
        }
        return addedNumbers;
    }

// Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        int reverse = reverse(number);
        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
    
    
    
    
    
    
    
    
    
    
    

    public static void opg68() {
        Scanner input = new Scanner(System.in);
        System.out.println("From \"km\" to miles");
        System.out.println("Or \"miles\" to km");

        String answer;

        double number;

        for (boolean run = true; run;) {

            answer = input.next();

            switch (answer) {
                case "km":
                    System.out.println("Write the km you want to convert:");
                    number = input.nextDouble();
                    System.out.println(kilometerToMile(number));
                    run = false;
                    break;
                case "miles":
                    System.out.println("Write the miles you want to convert:");
                    number = input.nextDouble();
                    System.out.println(mileToKilometer(number));
                    run = false;
                    break;
                case "q":
                    run = false;
                    break;
                default:
                    System.out.println("Not a vallid answer");
                    break;
            }

        }
    }

//     Convert from Mile to Kilometer
    public static double mileToKilometer(double mile) {
        return (mile * 1.6);
    }
    
//     Convert from Kilometer to Mile 
    public static double kilometerToMile(double kilometer) {
        return (kilometer / 1.6);
    }
    
    
    
    
    
    
    
    
    

    public static void opg622() {
        Scanner input = new Scanner(System.in);

        System.out.print("input number:");
        long number = input.nextLong();
        System.out.println(sqrt(number));
    }

    public static double sqrt(long n) {
        double lastGuess = n;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while ((lastGuess - nextGuess) > 0.0) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;

    }

    
    
    
    
    
    
    
    
    public static void opg625() {
        Scanner input = new Scanner(System.in);

        System.out.print("input milliseconds:");
        long milliS = input.nextLong();
        System.out.println(convertMillis(milliS));
    }

    public static String convertMillis(long millis) {

        long sec = (millis / 1000) % 60;
        long min = (millis / 1000 / 60) % 24;
        long hou = (millis / 1000 / 60 / 60);
//        System.out.println(sec);
//        System.out.println(min);
//        System.out.println(hou);
        String out = hou + ":" + min + ":" + sec;
        return out;
    }
    
    
    
    
    
    
    
    
    
    

    public static void opg628() {
        int[] array;
        array = new int[31];

        int multiplier = 1;

        //set up array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //Start test if numbers is prime
        for (int i = 2; i < array.length; i++) {

            //if number is greter then 0 it is a prime number
            if (array[i] > 0) {

                //removing all multimlide of prime number
                for (int j = i; array[j] * multiplier < array.length - 1; multiplier++) {

                    if (array[j * multiplier] != array[i]) {

                        array[j * multiplier] = 0;

                    } else {

                    }

                }

                // reset multiplier
                multiplier = 1;

            }

        }

        System.out.println("p           2^(p-1)");
        System.out.println("___________________");
        //Use methet to calculate Mersenne prime
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i] + ""+mersenneprime(array[i]) );
            }
        }
    }

    public static String mersenneprime(long millis) {

    }
    
    
    
    
    
    
    
    
    
    
    

    public static void opgD2() {

    }
    
    
    
    
    
    
    
    
    
    
    
    

    public static void opgD5() {

    }
    
    
    
    
    
    
    
    
    

    public static void opgD7() {

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void opgD8() {

    }

}
