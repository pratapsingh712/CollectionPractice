package inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product(101, "Laptop", 75000));
        manager.addProduct(new Product(102, "Smartphone", 25000));
        manager.addProduct(new Product(103, "Tablet", 18000));

        // Update existing product
        manager.addProduct(new Product(102, "Smartphone Pro", 30000));

        // List all
        manager.listAllProducts();

        // Get product
        System.out.println("\nGet Product ID 101: " + manager.getProduct(101));

        // Remove product
        manager.removeProduct(103);

        // List again
        manager.listAllProducts();

        // Total inventory value
        System.out.println("\nTotal Inventory Value: ₹" + manager.getTotalInventoryValue());
    }
}
