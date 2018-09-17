/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver_bog_2_2;
import java.util.Scanner;
/**
 *
 * @author Noob
 */
public class Opgaver_bog_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        
        System.out.println("Side længden på trekanten=");
        double side= 3.5;
        double area = (Math.sqrt(3)/4)*Math.pow(side , 2);
        
        double volume = area*side;
        System.out.println("Arialet er:"+area);
        System.out.println("Volumen er"+volume);
        
    }
    
}
