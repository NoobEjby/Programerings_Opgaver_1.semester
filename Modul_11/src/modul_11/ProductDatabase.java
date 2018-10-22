/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;

import java.awt.image.DataBuffer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Noob
 */
public class ProductDatabase {

    //Atributes
    private ArrayList<Product> dataB;

    //Constructor
    public ProductDatabase() {
        this.dataB = new ArrayList<>();
    }

    //Methods
    public ArrayList<Product> getDataB() {
        return this.dataB;
    }

    public boolean addProduct(Product p) {
        boolean exist = false;
        for (int i = 0; i < dataB.size(); i++) {
            

            
                if (dataB.get(i).equals(p)) {
                    exist = true;
                }
            

        }
        if (!exist) {
            this.dataB.add(p);

            return true;
        }
        return false;

    }

    public boolean removeProduct(Product p) {

        this.dataB.remove(p);

        return true;

    }

    public boolean addFoodProduct(String name, int price, int temp, Date time) {

        return true;
    }

    public double productsPrices() {
        double price = 0;
        for (int i = 0; i < dataB.size(); i++) {
            price += dataB.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
//      
        return "ups";
    }

}
