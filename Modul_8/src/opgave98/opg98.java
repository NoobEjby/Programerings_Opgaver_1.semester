/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave98;

import java.util.Date;

/**
 *
 * @author Noob
 */
public class opg98 {

    public static void run() {
        Date time = new Date();

        //Creating Fan number one
        Fan fan1 = new Fan();

        //Setting arguments of fan one
        fan1.setAtributes("Yellow", 10, true, 3);

        //Creating Fan number two
        Fan fan2 = new Fan();

        //Setting arguments of fan two
        fan2.setAtributes("Blue", 5, false, 2);


        
        //Fan state print out
        System.out.println(fan1.toString());
        
        System.out.println(fan2.toString());
        
        //Fan state print out plus date
        System.out.println(fan1.toString(time));
        
        System.out.println(fan2.toString(time));

    }
}
