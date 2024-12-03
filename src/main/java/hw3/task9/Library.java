package hw3.task9;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Book search(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public StringBuilder getLibraryInfo() {
        StringBuilder sb = new StringBuilder("Current state of library:\n");
        for (Book book : books) {
            sb.append(book.getBookInfo()).append("\n");
        }
        return sb;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Вокруг света за 80 дней", "Жюль Верн", 2021, true);
        Book book2 = new Book("Голова профессора Доуэля", "Сергей Беляев", 2018, true);
        Book book3 = new Book("Приключения капитана Врунгеля", "Андрей Некрасов", 2024, true);
        Book book4 = new Book("Всадник без головы", "Майн Рид", 2023, true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        System.out.println(library.getLibraryInfo());

        book1.borrowBook();
        book2.borrowBook();
        System.out.println(library.getLibraryInfo());

        book3.borrowBook();
        book4.borrowBook();
        book1.returnBook();
        book2.returnBook();
        System.out.println(library.getLibraryInfo());

        Book search  = library.search("Вокруг света за 80 дней");
        System.out.println(search.getBookInfo());
    }
}
