package Collection2;

import java.util.*;
/*Write an application to create a book managment system to do the following process :

Add book

Update book

Delete book

add author to each by using collection framwork.*/

public class BookManagementSystem {
    List<Book> books;

    public BookManagementSystem() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        Book newBook = new Book(title);
        books.add(newBook);
        System.out.println("Book added successfully.....!");
    }

    public void updateBook(String oldTitle, String newTitle) {
        for (Book book : books) {
            if (book.title.equals(oldTitle)) {
                book.title = newTitle;
                System.out.println("Book updated successfully....!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void deleteBook(String title) {
        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.title.equals(title)) {
                iterator.remove();
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void addAuthorToBook(String title, Author author) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                book.addAuthor(author);
                System.out.println("Author added to book successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManagementSystem system = new BookManagementSystem();

        int choice;
        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Add Author to Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    system.addBook(bookTitle);
                    break;
                case 2:
                    System.out.print("Enter old book title to update: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Enter new book title: ");
                    String newTitle = scanner.nextLine();
                    system.updateBook(oldTitle, newTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    system.deleteBook(deleteTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to add author: ");
                    String addAuthorTitle = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    Author author = new Author(authorName);
                    system.addAuthorToBook(addAuthorTitle, author);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
