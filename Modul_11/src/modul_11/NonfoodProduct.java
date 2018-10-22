/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;

/**
 *
 * @author Noob
 */
public class NonfoodProduct extends Product {

    private String[] matiral;

    public NonfoodProduct(String name, double price, String[] mat) {
        super(name, price);
        this.matiral = mat;

    }

    public String[] getMatiral() {
        return matiral;
    }

    public void setMatiral(String[] matiral) {
        this.matiral = matiral;
    }
    
    @Override
    public boolean equals(Object obj) {
        NonfoodProduct p = (NonfoodProduct) obj;
        if (obj instanceof NonfoodProduct) {
            if (this.getPrice() == p.getPrice() && this.getName() == p.getName()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        return getName() +"   "+matiral;
    }

}
