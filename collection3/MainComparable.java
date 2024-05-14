package collection3;
import java.util.*;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}

public class MainComparable {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 10.50));
        products.add(new Product("Product2", 5.25));
        products.add(new Product("Product3", 20.75));

        Collections.sort(products);

        for (Product p : products) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }
}
