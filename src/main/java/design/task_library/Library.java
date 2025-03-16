package design.task_library;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<BookCard> bookCards;

    public Library() {
        this.bookCards = new ArrayList<>();
    }

    public void addBook(Book book) {
        BookCard bookCard = new BookCard(book, null);
        bookCards.add(bookCard);
    }

    public void lendBook(Book book, Reader reader) {
        for (BookCard bookCard: bookCards) {
            if (bookCard.getBook().equals(book)) {
                if (bookCard.getReader() != null) {
                    throw new IllegalStateException("Book is already lent out");
                } else {
                    bookCard.setReader(reader);
                    return;
                }
            }
        }
        throw new NoSuchElementException("No such book in the library");
    }

    public void returnBook(Book book, Reader reader) {
        for (BookCard bookCard: bookCards) {
            if (bookCard.getBook().equals(book) &&
                    bookCard.getReader().equals(reader)) {
                bookCard.setReader(null);
            }
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available books:");
        for (BookCard bookCard: bookCards) {
            if (bookCard.getReader() == null) {
                System.out.println(bookCard.getBook());
            }
        }
    }

    public void showUnavailableBooks() {
        System.out.println("Unavailable books and their readers:");
        for (BookCard bookCard: bookCards) {
            if (bookCard.getReader() != null) {
                System.out.println("Book " + bookCard.getBook() + " Reader: " + bookCard.getReader());
            }
        }
    }
}
