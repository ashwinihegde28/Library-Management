public class Books {
     String isbn;
     String  title;
     String author;
     int availableCopies;
    String dueDate = null;
    int reservedBy = -1;

    public Books(String isbn, String title, String author, int availableCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

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

