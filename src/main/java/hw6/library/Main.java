package hw6.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Anna Karenina", "Lev Tolstoy", 445));
        library.addBook(new Book("Idiot", "Fedor Dostoyevsky", 378));

        library.listBooks();

        library.setActiveBook("Anna Karenina");

        Book activeBook = library.getActiveBook();

        System.out.println("Active book: " + activeBook);

        library.getActiveBook().navigateToPage(75);

        library.getActiveBook().nextPage();
        System.out.println("Get current page: " + library.getActiveBook().getCurrentPage());


        library.getActiveBook().previousPage();
        System.out.println("Get current page: " + library.getActiveBook().getCurrentPage());
    }
}
