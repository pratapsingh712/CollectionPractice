package inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager  {

    Map<Integer, Product> inventory = new HashMap<>();

    // add a new product or update the existing one
    public void addProduct(Product product){
        inventory.put(product.getId(),product);
        System.out.println("Product added/updated successfully :"+product);
    }

    // remove product by product id

    public void removeProduct(int productId){
        Product removed = inventory.remove(productId);
        if(removed!=null){
            System.out.println("Product removed successfully :"+removed);
        }else{
            System.out.println("Product is not present in the inventory :");
        }
    }

    // get product by id
    public Product getProduct(int productId){
        return inventory.get(productId);
    }

    //list all the product
    public void listAllProducts(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is Empty please try again later......");
        }else{
            System.out.println("Product available in the inventory are :");
            for(Product p : inventory.values()){
                System.out.println(p);
            }
        }
    }

    // Get total inventory value

    public double getTotalInventoryValue(){
        double total = 0.0;
        for(Product p : inventory.values()){
            total += p.getPrice();
        }
        // now can safely return the total inventory value:
        return total;
    }

}
