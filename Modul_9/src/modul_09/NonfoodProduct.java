/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_09;

/**
 *
 * @author Noob
 */
public class NonfoodProduct extends Product {

    private String matiral;

    public NonfoodProduct(int count, int id, String name, double price, String mat) {
        super(count, id, name, price);
        this.matiral = mat;

    }
    
    public String toString(){
        return getName() +"   "+matiral;
    }

}
