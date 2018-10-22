/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Noob
 */
public class FoodProduct extends Product {

    private int temp;
    Date lastDate;
    Date date = new Date();

    public FoodProduct(String name, double price, int days, int temp) {
        super(name, price);
        this.temp = temp;
        lastDate = addDays(date, days);

    }

    public static Date addDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);

        return cal.getTime();
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof FoodProduct) {
            FoodProduct p = (FoodProduct) obj;
            if (this.getPrice() == p.getPrice() && this.getName() == p.getName()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return getName() + "   " + lastDate;
    }

}
