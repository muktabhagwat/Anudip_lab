package String_Handling;

import java.util.Scanner; 
/*3. write a program to create Book management system.using linked list 
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add  3 books).
deleteBook() will delete book by Id
displayBook()will display book details
*/

import java.util.ArrayList;
import java.util.List;
public class LibraryManagementSystem 
{
    private static List<LibraryItem> libraryItems = new ArrayList<>();
    private static int itemIdCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Delete a Book");
            System.out.println("3. Display Library Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createBookFromUserInput();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    displayLibraryItems();
                    break;
                case 4:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createBook(String bookName, String author, double price, boolean availability) {
        Book book = new Book(itemIdCounter++, bookName, author, price, availability);
        libraryItems.add(book);
    }

    private static void createBookFromUserInput() {
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();

        System.out.print("Is the book available? (true/false): ");
        boolean availability = scanner.nextBoolean();

        createBook(bookName, author, price, availability);
        System.out.println("Book added successfully!");
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int bookIdToDelete = scanner.nextInt();

        boolean found = false;

        for (LibraryItem item : libraryItems) {
            if (item.getItemId() == bookIdToDelete && item instanceof Book) {
                libraryItems.remove(item);
                found = true;
                System.out.println("Book deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ID " + bookIdToDelete + " not found.");
        }
    }

    private static void displayLibraryItems() {
        if (libraryItems.isEmpty()) {
            System.out.println("No items available in the library.");
        } else {
            System.out.println("\n===== Library Items =====");
            for (LibraryItem item : libraryItems) {
                item.displayDetails();
            }
        }
    }
}
