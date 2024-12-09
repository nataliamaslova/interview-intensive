package hw6.library;

public class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 1;
    }

    public String getTitle() {
        return title;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPages=" + totalPages +
                ", currentPage=" + currentPage +
                '}';
    }

    public void navigateToPage(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= totalPages) {
            currentPage = pageNumber;
        } else {
            throw new IllegalArgumentException("Invalid page number");
        }
    }

    public void nextPage() {
        if (currentPage < totalPages) {
            currentPage ++;
        } else {
            System.out.println("You are on the last page");
        }
    }

    public void previousPage() {
        if (currentPage > 1) {
            currentPage --;
        } else {
            System.out.println("You are on the first page");
        }
    }
}
