package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Product implements Comparable<Product> 
{
    private String name;
    private double price;

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) 
    {
        return Double.compare(this.price, otherProduct.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductSortedExample
{
    public static void main(String[] args) 
    {
      
        LinkedList<Product> productList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products:- ");
        int numProducts = sc.nextInt();

        for (int i = 0; i < numProducts; i++)
        {
            System.out.println("Enter details for Product " + (i + 1) + ":-");
            System.out.print("Product name:- ");
            String name = sc.next();

            System.out.print("Product price:- ");
            double price = sc.nextDouble();

            productList.add(new Product(name, price));
        }

        
        System.out.println("\nUnsorted Product List:-");
        for (Product product : productList)
        {
            System.out.println(product);
        }

        
        Collections.sort(productList);

        
        System.out.println("\nSorted Product List Price Wise:-");
        for (Product product : productList) 
        {
            System.out.println(product);
        }

        
        sc.close();
    }
}
