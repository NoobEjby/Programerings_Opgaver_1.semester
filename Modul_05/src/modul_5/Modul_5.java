/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_5;

import java.util.Random;
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
        opgD8();
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
        int lengthOfNumber;
        
        //calculating length of number
        for (boolean run = true; run;) {

            length++;
            lengthOfNumber = (int) Math.pow(10, length);

            if (number < lengthOfNumber) {
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
        int tolle = 0;

        System.out.print("input number:");
        long number = input.nextLong();
        System.out.println(sqrt(number,tolle));
    }

    public static double sqrt(long n, int tol) {
        double lastGuess = n;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while ((lastGuess - nextGuess) > tol) {
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
                System.out.println(array[i] + "" + mersenneprime(array[i]));
            }
        }
    }

    public static String mersenneprime(long millis) {

    }
    
    

    public static void opgD2() {
        double[] array = {3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            array[i] = radius(array[i]);
        }
        System.out.println(sumOfRadius(array));
    }

    public static double radius(double r) {

        return (2 * Math.PI * r);
    }

    public static double sumOfRadius(double[] sum) {
        double sumOfArray = 0;
        for (int i = 0; i < sum.length; i++) {
            sumOfArray += sum[i];
        }
        return sumOfArray;
    }
    
    

    public static void opgD5() {

    }

    public static void opgD7() {
        boolean run = true;
        int cellsAlive = 0;
        int popularety = 0;
        int[] testX = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] testY = {0, 0, 0, 0, 0, 0, 0, 0};

        int[][] buffer = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

        int[][] update;
        update = new int[buffer.length][buffer[0].length];

        while (run) {

            printToConsol(buffer);
            //printing line
//            for (int y = 0; y < buffer.length; y++) {
//
//                for (int x = 0; x < buffer[y].length; x++) {
//
//                    if (buffer[y][x] == 1) {
//                        //System.out.print(popularety);
//                        System.out.print("1");
//                        cellsAlive++;
//                    } else {
//                        //System.out.print(popularety);
//                        System.out.print("0");
//
//                    }
//
//                }
//                System.out.println("");
//            }
            //stop When every cell is dead
            if (cellsAlive == 0) {
                run = false;
            } else {
                cellsAlive = 0;
            }

            //
            for (int y = 0; y < buffer.length; y++) {
                for (int x = 0; x < buffer[y].length; x++) {

                    //Getting nearby cell y cordinat
                    if (y - 1 < 0) {
                        testY[0] = testY[1] = testY[2] = buffer.length - 1;
                        testY[3] = testY[4] = y;
                        testY[5] = testY[6] = testY[7] = y + 1;
                    } else if (y + 1 >= buffer.length) {
                        testY[0] = testY[1] = testY[2] = y - 1;
                        testY[3] = testY[4] = y;
                        testY[5] = testY[6] = testY[7] = 0;
                    } else {
                        testY[0] = testY[1] = testY[2] = y - 1;
                        testY[3] = testY[4] = y;
                        testY[5] = testY[6] = testY[7] = y + 1;
                    }

                    //Getting nearby cell x cordinat
                    if (x - 1 < 0) {
                        testX[0] = testX[3] = testX[5] = buffer[y].length - 1;
                        testX[1] = testX[6] = x;
                        testX[2] = testX[4] = testX[7] = x + 1;

                    } else if (x + 1 >= buffer[y].length) {
                        testX[0] = testX[3] = testX[5] = x - 1;
                        testX[1] = testX[6] = x;
                        testX[2] = testX[4] = testX[7] = 0;

                    } else {
                        testX[0] = testX[3] = testX[5] = x - 1;
                        testX[1] = testX[6] = x;
                        testX[2] = testX[4] = testX[7] = x + 1;

                    }

                    //Testing nearby cells is allive
                    for (int i = 0; i < 8; i++) {
                        if (buffer[testY[i]][testX[i]] == 1) {
                            popularety++;

                        }

                    }
                    //Calculating if living cell dies
                    if (buffer[y][x] == 1) {
                        switch (popularety) {
                            case 2:
                            case 3:
                                update[y][x] = 1;
                                break;
                            default:
                                update[y][x] = 0;
                                break;
                        }
                    }

                    //Calculating if dead cell lives
                    if (buffer[y][x] == 0 && popularety == 3) {
                        update[y][x] = 1;
                    }

                    //Reset nerby cells
                    popularety = 0;
                }

            }
            //Copy update to buffer
            for (int y = 0; y < buffer.length; y++) {
                for (int x = 0; x < buffer[y].length; x++) {
                    buffer[y][x] = update[y][x];
                }
            }

            //Wait
            for (long i = 0; i < 10000000; i++) {
            }

            //Spacing
            System.out.println("");
            System.out.println("");

        }
    }

    public static void printToConsol(int[][] buffer) {

        for (int y = 0; y < buffer.length; y++) {

            for (int x = 0; x < buffer[y].length; x++) {

                if (buffer[y][x] == 1) {
                    //System.out.print(popularety);
                    System.out.print("1");
                } else {
                    //System.out.print(popularety);
                    System.out.print("0");

                }

            }
            System.out.println("");
        }

    }

    public static void opgD8() {
        int[][] array;
        array = new int[9][9];
        array = createSudoku(array);
        printArray(array);
        
    }

    public static int[][] createSudoku(int[][] array) {
        Random rand = new Random();
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = rand.nextInt(9) + 1;
            }

        }
        return array;
    }
    public static boolean isSudokuValide(int[][] array){
        
    }
    public static void printArray(int [][] array){
        for (int y = 0; y < array.length; y++) {

            for (int x = 0; x < array[y].length; x++) {

                System.out.printf("%-3d",array[x][y]);

                

            }
            System.out.println("");
        }
    }
    

}
