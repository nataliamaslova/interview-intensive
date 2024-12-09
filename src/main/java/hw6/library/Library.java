package hw6.library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Book activeBook;

    public Library() {
        this.books = new HashMap<>();
        this.activeBook = null;
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void setActiveBook(String title) {
        if (books.containsKey(title)) {
            activeBook = books.get(title);
            System.out.println("Switch to book " + title);
        } else {
            System.out.println("Book is not found in the library");
        }
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        books.values().forEach(System.out::println);

    }
}
