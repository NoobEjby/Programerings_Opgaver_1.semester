/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_10;

import java.util.UUID;

/**
 *
 * @author Noob
 */
public class Student {
    private String name;
    private UUID id;
    
    public Student(String name){
        this.name = name;
        this.id = UUID.randomUUID();
    }
    

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   
    
}
