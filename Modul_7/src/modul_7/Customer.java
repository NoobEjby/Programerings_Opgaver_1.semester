/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_7;

/**
 *
 * @author Noob
 */
public class Customer {
//    Atributes
    String name;
    int id;
    double balance;
    
//    Constructors
    public Customer(String aName,int aId){
        name=aName;
        id = aId;
        balance = 0;
    }
    
    public Customer(String aName,int aId,double aBalance){
        name=aName;
        id = aId;
        balance = aBalance;
    }
    
//    Methods
    public void deposit(double amount){
        
        balance += amount;
        
    }
    
    public void withdraw(double amount){
        if (amount<balance){
            balance -= amount;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
}
