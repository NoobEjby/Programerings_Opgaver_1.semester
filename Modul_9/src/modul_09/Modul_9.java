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
public class Modul_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductDatabase dB = new ProductDatabase(3);
        
        FoodProduct food = new FoodProduct(2, 7, "c,\")", 20, 2, -5);

        if (!dB.addProduct(20, 10, "Bannana", 2)) {
            System.out.println("Product already exist");
        }

        if (!dB.addProduct(30, 2, "Car", 20)) {
            System.out.println("Product already exist");
        }
        
        if (dB.addFoodProduct(2, 4, "orenge", 1.5, 2, -5)) {
            System.out.println("Product already exist");
        }

//        System.out.println(dB.productsPrices());
        
        System.out.println(dB.toString());
        
        
//        System.out.println(food.toString());

    }

}
