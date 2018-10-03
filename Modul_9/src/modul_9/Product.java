/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_9;

/**
 *
 * @author Noob
 */
public class Product {
    //Attributes
    private int count;
    private int id;
    private String name;
    private double price;
    
    //Constructor
    
    public Product(int id, String name, double price) {
        this(1, id, name, price);
        
        
       
    }
    
    public Product(int count,int id, String name, double price) {
        this.count= count;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    Product(int count, int id, Product name, double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

    //Methods
    public void adgustCount(int count) {
        this.count += count;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public int getCount() {
        return count;
    }
    

    
    
       
}
