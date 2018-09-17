/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_4;

import java.util.Scanner;

/**
 *
 * @author Noob
 */
public class Modul_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OpgC3();
    }

    public static void Opg73() {
        Scanner input = new Scanner(System.in);
        int[] array;
        int counter = 0;
        array = new int[10];
        System.out.print("Enter the integers between 1 and 50: ");

        //udfylder array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        //numberst to be countet in array
        for (int i = 0; i <= 50; i++) {

            //Testing number from 1-50 if thay are in the array
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    counter++;
                }
            }
            //If number is ther mor then 0 times
            if (counter > 0) {
                System.out.println(i + " occurs " + counter + " times");
                counter = 0;
            }

        }
    }

    public static void Opg73B() {
        Scanner input = new Scanner(System.in);
        int[] array = {2, 5, 6, 49, 3, 4, 3, 4, 37, 36, 2, 35, 37, 47, 3, 26, 5, 36, 47, 8, 9, 3, 1, 8, 2, 8, 26, 6, 26, 27, 2, 16, 2, 26, 27, 29};
        //array = new int[34];
        int counter = 0;

        System.out.print("Enter the integers between 1 and 50: ");

        //numberst to be countet in array
        for (int i = 0; i <= 50; i++) {

            //Testing number from 1-50 if thay are in the array
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    counter++;
                }
            }
            //If number is ther mor then 0 times
            if (counter > 0) {
                System.out.println(i + " occurs " + counter + " times");
                counter = 0;
            }

        }
    }

    public static void Opg82() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4−by−4 matrix row by row: ");
        double[][] array;
        double calculation = 0;

        array = new double[4][4];

        //fill array
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                array[y][x] = input.nextDouble();
            }
        }

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++) {
                calculation += array[y][x];
            }

        }
        calculation = calculation / 16;
        System.out.println(calculation);

    }

    public static void OpgC1() {
        double[] radius = {1, 2, 3, 4, 5};
        double area;

        //using radius from array
        for (int i = 0; i < radius.length; i++) {
            
            //Calculating area
            area = Math.PI * Math.pow(radius[i], 2);
            System.out.println("area of a cikel with a redius if " + radius[i] + " is " + area);
        }

    }

    public static void OpgC3() {
        double[] dayTemp = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};
        double tempDif = 0;
        for (int i = 0; i < dayTemp.length - 1; i++) {
            tempDif = dayTemp[i + 1] - dayTemp[i];
            System.out.println("" + tempDif);

        }
    }

    public static void OpgC4() {
        Scanner input = new Scanner(System.in);
        int[] monthe = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Wrive a monthe number: ");
        int monthNumber = input.nextInt();
        if (monthNumber < 13 && monthNumber > 0) {
            System.out.println("number of days in month number " + monthNumber + " is " + monthe[monthNumber - 1]);
        } else {
            System.out.println("Not a valit month number");
        }

    }

    public static void OpgC5() {

        int greatest = 0;

        int[] array;
        array = new int[100000];

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

                    }
                    
                    //Save the greatest number found
                    greatest = array[i];

                }

                // reset multiplier
                multiplier = 1;

            }

        }
        
        //Print out the greatest number
        System.out.println(greatest);

    }

    public static void OpgC6() {
        int[] array = {23, 4, 87, 47, 465, 86, 34, 57, 8, 9656, 23, 54, 7, 68, 6, 8, 67, 564};
        int greatest = array[0];

        //Testing every spot in the array
        for (int i = 0; i < array.length; i++) {
            
            //If number in array is greater then the greatest number found
            //replase the number
            if (greatest < array[i]) {
                greatest = array[i];
            }
        }
        
        //Print out the greatest number
        System.out.println("Greatest number in array:" + greatest);
    }

    public static void OpgC7() {
        boolean run = true;
        int cellsAlive = 0;
        int popularety = 0;
        int[] testX = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] testY = {0, 0, 0, 0, 0, 0, 0, 0};

        int[][] buffer = {
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

        int[][] update;
        update = new int[buffer.length][buffer[0].length];

        while (run) {

            //printing line
            for (int y = 0; y < buffer.length; y++) {

                for (int x = 0; x < buffer[y].length; x++) {

                    if (buffer[y][x] == 1) {
                        //System.out.print(popularety);
                        System.out.print("1");
                        cellsAlive++;
                    } else {
                        //System.out.print(popularety);
                        System.out.print("0");

                    }

                }
                System.out.println("");
            }

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
            for (long i = 0; i < 100000000; i++) {
            }

            //Spacing
            System.out.println("");
            System.out.println("");

            

        }
    }
}
