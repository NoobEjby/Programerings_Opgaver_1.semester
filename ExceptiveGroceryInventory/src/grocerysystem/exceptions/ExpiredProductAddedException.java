/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerysystem.exceptions;

/**
 *
 * @author ancla
 */
public class ExpiredProductAddedException extends Exception {
    public ExpiredProductAddedException()
    {
        super("Attempt to add expired product.");
    }
}
