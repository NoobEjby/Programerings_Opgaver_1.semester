package grocerysystem;

import java.text.DecimalFormat;
import java.util.UUID;
import grocerysystem.products.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {

    private HashMap<UUID, Product> products;

    public ProductDatabase() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product p) {
        UUID key = p.getSerial();
        products.put(key, p);
    }

    public void removeProduct(UUID serial) {
        
                products.remove(products.keySet());
            
    }

    public void removeProduct(Product p) {
        
                products.remove(products.values());
           
    }

    public String printInventory() {
        //Use StringBuild to create a combined string from multiple strings.
        StringBuilder sb = new StringBuilder();
        //Append adds String to the end of the combined string.
        sb.append("Lagerbeholdning:\n");

        for (Map.Entry<UUID, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            sb.append("Name: ").append(p.getName()).append("\t")
                    .append("Price: ").append(p.getPrice()).append("\t")
                    .append("Serial: ").append(p.getSerial()).append("\n");
        }
        //Call toString on the StringBuilder object, to get the String representation.
        return sb.toString();
    }

    public String getTotalPrice() {
        double result = 0;
        //Loop through all products. Accumulate prices.
        for (Map.Entry<UUID, Product> entry : products.entrySet()) {
            Product prod = entry.getValue();
            result += prod.getPrice();
        }
        //Use DecimalFormat class to get a currency representation of the double in local currency.
        return DecimalFormat.getCurrencyInstance().format(result);
    }

    public ArrayList<Product> getProducts() {
        ArrayList<Product> allProducts = new ArrayList<>();

        for (Map.Entry<UUID, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            allProducts.add(p);

        }
        //Return a copy of the array, so that the database is not exposed to external actors.
        return allProducts;
    }

    public void removeExpiredFoods() {
        ArrayList<Product> expiredProducts = new ArrayList<>();
        for (Map.Entry<UUID, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            try {
                if (p.isExpired()) {
                    // can do products.remove(p) as we are iterating the list. Save for later.
                    expiredProducts.add(p);
                }
            } catch (UnsupportedOperationException ex) {
                //Encountered a NonFoodProduct-object. Nothing to worry about.
            }
        }
        System.out.println("Removing a total of " + expiredProducts.size() + " expired product(s)");
        for (Product expiredProduct : expiredProducts) {
            products.remove(expiredProduct);
        }
    }

    public ArrayList<Product> sortedByPrice() {
        ArrayList data = new ArrayList<>(products.values());
        Collections.sort(data);
        return data;
    }

}
