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

/**
 *
 * @author Noob
 */
public class Opgave1 {
    
    
    public void run(){
        String input = "1,2,red,blue";

        File myFile = new File("C:\\Users\\Noob\\SDU_Software_ingeniør\\Objektorinteret programering\\Programerings_Opgaver_1.semester\\Modul_13_files\\twocolors.csv");

        PrintWriter pw;

        try {
            pw = new PrintWriter(myFile);
            pw.println(input);
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");

        }

        Scanner reader;

        try {
            reader = new Scanner(myFile).useDelimiter(",");
            System.out.println(reader.nextInt());
            System.out.println(reader.nextInt());
            System.out.println(reader.next());
            System.out.println(reader.next());

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        
}
}
