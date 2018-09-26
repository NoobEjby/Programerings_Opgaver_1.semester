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
public class Modul_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Assignments 1
        Customer aCustomer = new Customer("John Doe", 42);

        aCustomer.deposit(500);
        aCustomer.withdraw(250);
        System.out.println(aCustomer.getBalance());

//        Assignments 2
        CustomerDatabase database = new CustomerDatabase();
        database.addCustomer(aCustomer);
        Customer cust1 = new Customer("Doe John", 23);
        cust1.deposit(3456);
        database.addCustomer(cust1);
        Customer cust2 = new Customer("Jesper Doe", 29);
        cust2.deposit(987654);
        database.addCustomer(cust2);
        Customer cust3 = new Customer("Hanne Doe", 72);
        cust3.deposit(0);
        database.addCustomer(cust3);
        Customer cust4 = new Customer("Ib Doe", 84);
        cust4.deposit(2345);
        database.addCustomer(cust4);
        Customer cust5 = new Customer("Bo Doe", 63);
        cust5.deposit(72640);
        database.addCustomer(cust5);
        Customer cust6 = new Customer("lis Doe", 28);
        cust6.deposit(9298372);
        database.addCustomer(cust6);
        database.removeCustemer(29);
        database.printCustomers();
    }

}
