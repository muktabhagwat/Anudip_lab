package String_Handling;
public class Book extends LibraryItem {
    private String author;
    private double price;

    public Book(int itemId, String itemName, String author, double price, boolean availability) {
        super(itemId, itemName, availability);
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Implementation of abstract method to display book details
    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + getItemId());
        System.out.println("Book Name: " + getItemName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
        System.out.println("-------------------------");
    }
}


