package week2.thursday.task4;

import java.util.Comparator;

/**
 * Create class Product with fields name, price and quantity.
 */
public class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product comparePrice(Product p) {
        if (this.getPrice() > p.getPrice()) {
            return this;
        } else {
            return p;
        }
    }

    public Product compareQuantity(Product p) {
        if (this.getQuantity() > p.getQuantity()) {
            return this;
        } else {
            return p;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
