/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerysystem.products;

import java.util.Date;

/**
 *
 * @author Noob
 */
public class ExpiredProductAddedException extends Exception {

    public ExpiredProductAddedException(String p, Date expireDate) {
        super("\n"+"Attempted to add expired " + p + " to database"+".\n"+expireDate+".\n\n");
        
    }

}
