/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver_bog_2;
import java.util.Scanner;

/**
 *
 * @author Noob
 */
public class Opgaver_bog_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        
        System.out.print("intast miles:");
        
        double miles = sca.nextDouble();
        
        System.out.println(miles + " miles er "+ miles * 1.6 +" kilometer");
    }
    
}
