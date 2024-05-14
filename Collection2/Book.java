package Collection2;

import java.util.ArrayList;
import java.util.List;

class Book
{
    String title;
    List<Author> authors;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}