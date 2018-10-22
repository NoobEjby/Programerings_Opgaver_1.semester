/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;

/**
 *
 * @author Noob
 */
public class Modul_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductDatabase dB = new ProductDatabase();
        
        Product stuff1 = new Product("Stuff1", 100);

        Product stuff = new Product("Stuff", 10);

        dB.addProduct(stuff);

        FoodProduct food = new FoodProduct("Orange", 20, 20, 5);

        dB.addProduct(food);
        
        
        
        

        dB.addProduct(food);
        

        
        String[] mat = {"Screen","cord","remote"};

        NonfoodProduct tv = new NonfoodProduct("tv", 200, mat);
        
        
        
        
        dB.addProduct(tv);
        
        

        System.out.println(dB.productsPrices());
        
        FoodProduct food2 = new FoodProduct("Orange", 21, 20, 5);

        dB.addProduct(food2);
        
        dB.addProduct(stuff1);
        
        System.out.println(dB.productsPrices());

    }

}
