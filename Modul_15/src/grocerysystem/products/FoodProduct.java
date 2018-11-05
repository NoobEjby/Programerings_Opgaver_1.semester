package grocerysystem.products;

import java.util.Date;
import java.util.Objects;

public class FoodProduct extends Product {

    private Date expireDate;
    private int storeTemp;

    public FoodProduct(String name, double price, Date expireDate, int storeTemp) throws  ExpiredProductAddedException{
        super(name, price);
        if (expireDate.before(new Date())) {
            
            throw new  ExpiredProductAddedException(name, expireDate);
        }else{
        this.expireDate = expireDate;
        }
        this.storeTemp = storeTemp;
    }

    public int getStoreTemp() {
        return storeTemp;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return this.getName() + " Udløber:" + expireDate;
    }

    @Override
    public boolean equals(Object o) {
        FoodProduct p;
        if (o instanceof FoodProduct) {
            p = (FoodProduct) o;
            if (this.getSerial().equals(p.getSerial()) && this.expireDate.equals(p.expireDate)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean isExpired() {
       return expireDate.before(new Date());
        
    }
    
    

}
