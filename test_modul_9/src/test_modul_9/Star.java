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
public class Star extends Shape{
    
    
    public Star(Color c,double area) {
        setC(c);
        this.area = area;
    }
    
    @Override
    public void redraw(){
        System.out.println("*");
    }
    
    @Override
    public String toString(){
        return "Bare en stjerne";
    }
    
}
