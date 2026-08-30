
class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    Book(String title, String author, String bookCode) {
        if (title == null || title.isBlank())
            throw new IllegalArgumentException();

        if (author == null || author.isBlank())
            throw new IllegalArgumentException();

        if (bookCode == null || bookCode.isBlank())
            throw new IllegalArgumentException();

        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        loaned = false;
    }

    boolean borrowBook() {
        if (loaned)
            return false;

        loaned = true;
        return true;
    }

    boolean returnBook() {
        if (!loaned)
            return false;

        loaned = false;
        return true;
    }

    boolean isAvailable() {
        return !loaned;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getBookCode() {
        return bookCode;
    }

    public String toString() {
        return title + " " + author + " " + bookCode + " Available: " + isAvailable();
    }
}

public class BookLoan {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James", "B101");
        Book b2 = new Book("Python", "Guido", "B102");

        System.out.println(b1);
        System.out.println(b1.borrowBook());
        System.out.println(b1.borrowBook());
        System.out.println(b1.returnBook());
        System.out.println(b1.returnBook());

        System.out.println(b1);
        System.out.println(b2);
    }
}

