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
public class Shape {

    private Color c;
    double area;

    public void redraw() {
        System.out.println("Can´t draw shape");
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Color getC() {
        return c;
    }

    @Override
    public String toString() {
        return this.c.toString() + " " + this.area;
    }

}
