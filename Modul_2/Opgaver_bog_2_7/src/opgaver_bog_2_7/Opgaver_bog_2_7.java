/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver_bog_2_7;

/**
 *
 * @author Noob
 */
public class Opgaver_bog_2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //input
        int min = 1000000000;
        //calculations
        int days_all = min / 60 / 24;
        int years = min / 60 / 24 / 365;
        int days_dif = days_all - (years * 365);
        //output
        System.out.println(min + " minutes is approximately " + years + " years and " + days_dif + " days");
    }

}
