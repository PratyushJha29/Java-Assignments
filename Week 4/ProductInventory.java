
class Product {
    private String code;
    private String name;
    private double price;
    private int quantity;
    private static int count = 0;

    Product(String code, String name, double price) {
        this(code, name, price, 0);
    }

    Product(String code, String name, double price, int quantity) {
        if (price <= 0 || quantity < 0)
            throw new IllegalArgumentException();

        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        count++;
    }

    boolean restock(int amount) {
        if (amount <= 0)
            return false;

        quantity += amount;
        return true;
    }

    boolean sell(int amount) {
        if (amount <= 0 || amount > quantity)
            return false;

        quantity -= amount;
        return true;
    }

    double getInventoryValue() {
        return price * quantity;
    }

    static int getProductCount() {
        return count;
    }

    public String toString() {
        return code + " " + name + " Price: " + price + " Quantity: " + quantity;
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000);
        Product p2 = new Product("P102", "Mouse", 500, 10);
        Product p3 = new Product("P103", "Keyboard", 1000, 5);

        p1.restock(2);
        p2.sell(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.getInventoryValue());
        System.out.println(Product.getProductCount());
    }
}

