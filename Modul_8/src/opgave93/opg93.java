/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave93;

import java.util.Date;

/**
 *
 * @author Noob
 */
public class opg93 {

    public static void run() {
        Date time = new Date();
        long timeSet = 10000;
        
        
        
        
        for (int i = 0; i < 8; i++) {
            
            time.setTime((long) timeSet);
            System.out.println(time.toString());
            
            timeSet *= 10;
        }
    }
}
