/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_modul_9;

import java.awt.Color;

/**
 *
 * @author Noob
 */
public class Test_modul_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Color coler = new Color(0,255,0);
        Circle circ1 = new Circle(coler,24.5);
        
        circ1.redraw();
        
        Star star = new Star(coler, 23.5);
        
        star.redraw();
        
//        for(int i = 0; i < 1000000000;i++){
//            
//        }
        
        System.out.println(star.toString());
        System.out.println(circ1.toString());
    }
    
}
