/**
 * The Books class represents a book in the library system.
 * It includes details such as ISBN, title, author, available copies,
 * due date for borrowed books, and information about reservation.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    // Set the due date when the book is checked out
    public void setDueDate(LocalDate date) {
        this.dueDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public LocalDate getDueDate() {
        return LocalDate.parse(this.dueDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    // Due date must be cleared and set to null when  the book is returned
    public void clearDueDate() {
        this.dueDate = null;
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

