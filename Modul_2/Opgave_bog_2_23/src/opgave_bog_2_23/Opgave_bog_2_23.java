/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave_bog_2_23;

/**
 *
 * @author Noob
 */
public class Opgave_bog_2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dist = 900.5;
        double km_l = 14.5;
        double price_l = 11.22;
        double l_used= dist/km_l;
        double price = l_used*price_l;
        System.out.println("The cost of the drive was "+price+"kr");
        
    }
    
}
