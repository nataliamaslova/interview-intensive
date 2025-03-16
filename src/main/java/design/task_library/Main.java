package design.task_library;

public class Main {
    public static void main(String[] args) {
        Book greenBook = new Book("Green book", "A");
        Book redBook = new Book("Red book", "B");
        Book yellowBook = new Book("Yellow book", "C");

        Reader vasya = new Reader("Vasya");
        Reader petya = new Reader("Petya");

        Library library = new Library();

        library.addBook(greenBook);
        library.addBook(redBook);
//        library.showAvailableBooks();
//        library.showUnavailableBooks();

        library.lendBook(greenBook, vasya);
//        library.showAvailableBooks();
//        library.showUnavailableBooks();

        library.lendBook(redBook, petya);
//        library.showAvailableBooks();
//        library.showUnavailableBooks();

        library.returnBook(greenBook, vasya);
        library.showAvailableBooks();
        library.showUnavailableBooks();

//        library.lendBook(redBook, vasya);
        library.lendBook(yellowBook, petya);
    }
}
