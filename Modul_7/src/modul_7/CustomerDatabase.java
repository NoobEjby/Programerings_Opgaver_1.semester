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
public class CustomerDatabase {
//    Atributes

    Customer[] customers;

//    Constructors
    public CustomerDatabase() {
        customers = new Customer[2];
    }

//    Methods
    public void addCustomer(Customer c) {
        boolean isRoom = false;
        while (!isRoom) {
            for (int i = 0; i < customers.length; i++) {
                if (customers[i] == null) {
                    customers[i] = c;
                    isRoom = true;
                    break;
                }
            }
            //if there is no room in array create a double as big array
            if (!isRoom) {
                
                Customer[] backup = new Customer[customers.length * 2];
                for(int i = 0;i<customers.length;i++){
                    backup[i]=customers[i];
                }
//                System.arraycopy(customers, 0, backup, 0, customers.length);
                customers = backup;
            }
        }

    }

    public void removeCustemer(int id) {
        for (int i = 0; i < customers.length; i++) {
            if ((customers[i].id) == id) {
                customers[i] = null;
                break;
            }

        }
    }

    public void printCustomers() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.printf("%-20s", "name:" + customers[i].name);
                System.out.printf("%-10s", "id:" + customers[i].id);
                System.out.printf("%-20s", "balance:" + customers[i].balance);
                System.out.println();
            }

        }

    }

}
