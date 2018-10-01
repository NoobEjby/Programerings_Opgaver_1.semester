/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave98;

import java.awt.BorderLayout;
import java.util.Date;
import javafx.scene.control.Toggle;

/**
 *
 * @author Noob
 */
public class Fan {

    final static int SLOW = 1;
    final static int MEDEUM = 2;
    final static int FAST = 3;
    String color;
    private boolean on;
    private int speed;
    private double radius;
    String text;

    public Fan() {

        this.radius = 5;
        this.color = "blue";
        this.on = false;
        this.speed = SLOW;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setOn() {
        this.on = !this.on;
    }

    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = SLOW;
                break;
            case 2:
                this.speed = MEDEUM;
                break;
            case 3:
                this.speed = FAST;
                break;
            default:
                this.speed = SLOW;
                break;
        }

    }

    public String toString() {

        
        if (this.on){
            return this.color +"  "+this.radius+"   "+this.speed;
        }else{
            return "The fan is off";
        }
    }
    
    public String toString(Date time) {
        return time +"  "+toString();
    }

}
