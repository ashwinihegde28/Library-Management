/**
 * The Books class represents a book in the library system.
 * It includes details such as ISBN, title, author, available copies,
 * due date for borrowed books, and information about reservation.
 */
public class Books {
    String isbn;
    String title;
    String author;
    int availableCopies;
    // The due date for returning the book (if borrowed), null if not borrowed
    String dueDate = null;
    // The ID of the member who has reserved the book, -1 if not reserved
    int reservedBy = -1;

    //Parametrised constructor
    public Books(String isbn, String title, String author, int availableCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    // Returns A string representation of the Books object
    @Override
    public String toString() {
        return "Books{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availableCopies='" + availableCopies + '\'' +
                (reservedBy != -1 ? ", Reserved By: Member " + reservedBy : "") +
                (dueDate != null ? ", Due Date: " + dueDate : "");

    }
}

