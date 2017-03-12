package week2.thursday.task4;

/**
 * Create four instances of type Product.
 * Display the name and quantity of the most expensive item.
 * Display the name of the item, which has the biggest quantity.
 */
public class Main {

    public static void main(String[] args) {
        Product box = new Product("Box", 100, 10);
        Product table = new Product("Table", 500, 20);
        Product chair = new Product("Chair", 300, 50);
        Product lamp = new Product("Lamp", 200, 30);

        Product productWithMaxPrice = box.comparePrice(table.comparePrice(chair.comparePrice(lamp)));
        Product productWithMaxQuantity = box.compareQuantity(table.compareQuantity(chair.compareQuantity(lamp)));

        System.out.println("The most expensive item:\n" +
                "Name: " + productWithMaxPrice.getName() + "\n" +
                "Quantity: " + productWithMaxPrice.getQuantity());

        System.out.println("The item with the biggest quantity:\n" +
                "Name: " + productWithMaxQuantity.getName());
    }
}
