/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;

import java.util.UUID;

/**
 *
 * @author Noob
 */
public class Product {
    //Attributes
    
    private UUID id;
    private String name;
    private double price;
    
    //Constructor
    
    
    
    public Product(String name, double price) {
        
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    
    
    
    
    
    

    //Methods
    

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    
    

    
    
       
}
