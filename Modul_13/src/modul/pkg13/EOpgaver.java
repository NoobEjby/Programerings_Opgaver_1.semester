/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.util.Elements;

/**
 *
 * @author Noob
 */
public class EOpgaver {

    int elements = 4;
    File myFile = new File("C:\\Users\\Noob\\SDU_Software_ingeniør\\Objektorinteret programering\\Programerings_Opgaver_1.semester\\Modul_13_files\\twocolors2,5.csv");

    PrintWriter pw;

    Scanner reader;

    public void run() {
        String input = "1   ,2,red,blue,";

        writeToFile(input);

        scanRead();

        

    }

    public boolean writeToFile(String text) {

        try {
            pw = new PrintWriter(myFile);
            pw.println(text);
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");

        }

        return true;
    }

    public boolean scanRead() {

        try {
            reader = new Scanner(myFile).useDelimiter(",");

            for (int i = 0; i < elements; i++) {
                System.out.print(i + 1 + ": ");
                System.out.println(reader.next());
                reader.close();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        System.out.println("");
        return true;
    }

    public boolean add(int number, String s) {
        try {
            String update = "";
            elements += 1;
            reader = new Scanner(myFile).useDelimiter(",");
            for (int i = 0; i < elements; i++) {
                if (!(i == number - 1)) {
                    update += reader.next() + ",";
                } else {
                    update += s + ",";
                }
               
            }
            reader.close();
            writeToFile(update);

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EOpgaver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean remove(int number) {
        try {
            String update = "";
            reader = new Scanner(myFile).useDelimiter(",");
            for (int i = 0; i < elements; i++) {
                if (!((i) == number-1)) {
                    update += reader.next() + ",";
                } else {
                    reader.next();
                }
            }
            reader.close();
            elements -= 1;
            writeToFile(update);

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EOpgaver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}
