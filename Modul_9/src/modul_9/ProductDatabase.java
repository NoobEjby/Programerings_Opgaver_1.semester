/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_9;

import java.util.Date;

/**
 *
 * @author Noob
 */
public class ProductDatabase {

    //Atributes
    private Product[] dataB;

    //Constructor
    public ProductDatabase() {
        this.dataB = new Product[1];
    }

    public ProductDatabase(int size) {
        this.dataB = new Product[size];
    }

    //Methods
    public Product[] getDataB() {
        return this.dataB;
    }

//    public boolean addProduct(Product p) {
//        boolean isRoom = true;
//
//        while (isRoom) {
//            for (int i = 0; i < dataB.length; i++) {
//                if (dataB[i] != null) {
//                    dataB[i] = p;
//                    return true;
//
//                }
//                if (dataB[i].getId() == p.getId()) {
//                    return false;
//
//                }
//
//            }
//            //if there is no room in array create a double as big array
//            if (!isRoom) {
//
//                Product[] backup = new Product[dataB.length * 2];
//                for (int i = 0; i < dataB.length; i++) {
//                    backup[i] = dataB[i];
//                }
////                System.arraycopy(customers, 0, backup, 0, customers.length);
//                dataB = backup;
//            }
//        }
//
//        return true;
//    }
    public boolean removeProduct(Product p) {
        for (int i = 0; i < dataB.length; i++) {
            if (dataB[i].getId() == p.getId()) {
                dataB[i] = null;
                return true;

            }
        }
        return false;

    }

    public boolean addProduct(int id, int count, String name, double price) {
        boolean isRoom = true;
        Product nam = new Product(count, id, name, price);

        for (Product dataB1 : dataB) {
            if (dataB1 != null && dataB1.getId() == nam.getId()) {
                return false;
            }
        }

        while (isRoom) {

            for (int i = 0; i < dataB.length; i++) {
                if (dataB[i] == null) {
                    dataB[i] = nam;
                    isRoom = false;
                    return true;
                }
            }

            //if there is no room in array create a double as big array
            if (!isRoom) {
                Product[] backup = new Product[dataB.length * 2];
                for (int i = 0; i < dataB.length; i++) {
                    backup[i] = dataB[i];
                }
//                System.arraycopy(customers, 0, backup, 0, customers.length);
                dataB = backup;
            }
        }

        return true;
    }

    public boolean addFoodProduct(int id, int count, String name, double price, int days, int temp) {
        boolean isRoom = true;
        FoodProduct nam = new FoodProduct(count, id, name, price, days, temp);

        for (Product dataB1 : dataB) {
            if (dataB1 != null && dataB1.getId() == nam.getId()) {
                return false;
            }
        }

        while (isRoom) {

            for (int i = 0; i < dataB.length; i++) {
                if (dataB[i] == null) {
                    dataB[i] = nam;
                    isRoom = false;
                    return true;
                }
            }

            //if there is no room in array create a double as big array
            if (!isRoom) {
                Product[] backup = new Product[dataB.length * 2];
                for (int i = 0; i < dataB.length; i++) {
                    backup[i] = dataB[i];
                }
//                System.arraycopy(customers, 0, backup, 0, customers.length);
                dataB = backup;
            }
        }

        return true;
    }

    public double productsPrices() {
        double price = 0;

        for (int i = 0; i < dataB.length; i++) {
            if (dataB[i] != null) {

                price += dataB[i].getPrice() * dataB[i].getCount();

            }
        }

        return price;
    }

    public String toString() {
//        return dataB[2].toString();
        for (int i = 0; i < dataB.length; i++) {
            if (dataB[i].toString() != null) {
                System.out.println(dataB[i].toString());
            }
        }
        return "ups";
    }

}
