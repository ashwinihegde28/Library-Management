public class Library {
    private Books[] books;

    // Counter for the number of books in the library
    private int bookCount;

    // Counter for the number of members in the library
    private Member[] members;

    // Counter for generating unique member IDs
    private static int memberCnt = 0;



    private int memberIdCntr = 0;

    // Constructor to initialise the maxmimum books and maximum members library can have and the book count.
    public Library(int maxBookCount, int maxMember) {
        books = new Books[maxBookCount];
        bookCount = 0;
        members = new Member[maxMember];
    }


    // Code for the Book Management goes here

    // Method to add a new book to the library
    public void addBook(String isbn, String title, String author, int copies) {
        if (bookCount < books.length) {
            books[bookCount] = new Books(isbn, title, author, copies);
            bookCount++;
            System.out.println("Book added successfully with book count being : " + bookCount);
        } else {
            System.out.println("Cannot add more books since library is at its full capacity.");
        }
    }

    // Method to find a book by its ISBN
    public int findBookByISBN(String isbn) {
        if (isbn != null && books != null) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null && books[i].isbn.equals(isbn)) {
                    System.out.println("Book Found! " + books[i]);
                    return i;
                }
            }
        }
        return -1;
    }

    // Method to check out a book from the library
    public void checkOutBook(int bookIndex) {
        if (bookIndex >= 0 && books[bookIndex].availableCopies > 0 && bookCount > bookIndex) {
            books[bookIndex].availableCopies--;
        } else {
            System.out.println("Cannot Check out: insufficient copies or given bookIndex invalid");
        }
    }

    // Method to check in a book back into the library
        public void checkInBook(int bookIndex) {
        if (bookIndex >= 0 && bookCount > bookIndex) {
            books[bookIndex].availableCopies++;
        } else {
            System.out.println("Sorry, Given bookIndex is invalid");
        }
    }

    // Method to display the details of a specific book
    public void displayBookDetails(int bookIndex) {
        if (bookIndex >= 0 && bookCount > bookIndex) {
            Books book = books[bookIndex];
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Available Copies: " + book.availableCopies);
        } else {
            System.out.println("Sorry, Given bookIndex is invalid");
        }
    }

    // Method to display the details of all books in the library
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books are available in the library.");
        } else {
            System.out.println("Displaying all the books ");
            for (int i = 0; i < bookCount; i++) {
                if (books[i] != null) {
                    System.out.println(books[i]);
                }
            }
        }

    }
    // Method to search for a book by its title
    public Books searchBookByTitle(String title) {
        if (title != null && books != null && bookCount > 0) {
            for (int i = 0; i < bookCount; i++) {
                if (books[i] != null && books[i].title.equals(title)) {
                    return books[i];
                }
            }

        }
        System.out.println("Sorry invalid search: Either books are empty or wrong tittle given in search");
        return null;
    }

    // Method to search for a book by its author
    public Books searchBookByAuthor(String author) {
        if (author != null && books != null && bookCount > 0) {
            for (int i = 0; i < bookCount; i++) {
                if (books[i] != null && books[i].author.equals(author)) {
                    return books[i];
                }
            }
        }
        System.out.println("Sorry invalid search: Either books are empty or wrong author given in search");
        return null;
    }


    // Code for the Member Management goes here
    // Method to add a new member to the library
    public void addMember(String name) {
        if (memberCnt < members.length) {
            members[memberCnt] = new Member(name);
            members[memberCnt].memberId = memberIdCntr++;
            System.out.println("Member created with id: " + members[memberCnt].memberId);
            memberCnt++;
            System.out.println("Currently we have : " + memberCnt + " of members");
        } else {
            System.out.println("Sorry : Cannot add more members since library is at its full capacity.");
        }

    }

    // Method to find a member by their ID
    public int findMemberById(int memberId) {
        if (memberId > 0) {
            for (int i = 0; i < memberCnt; i++) {
                if (members[i] != null && members[i].memberId == memberId) {
                    System.out.println("Member Found! " + members[i]);
                    return i;
                }
            }
        }
        System.out.println("Invalid member Id.");
        return -1;

    }

    // Method to display the details of a specific member
    public void displayMemberDetails(int memberIndex) {
        if (memberIndex >= 0 && memberCnt > memberIndex) {
            Member member = members[memberIndex];
            System.out.println("Member Id: " + member.memberId);
            System.out.println("Member Name : " + member.name);
        } else {
            System.out.println("Invalid member index.");
        }
    }

    // Method to display the details of all members in the library
    public void displayAllMembers() {
        System.out.println("Displaying all the members");
        for (int i = 0; i < memberCnt; i++) {
            if (members[i] != null) {
                System.out.println(members[i]);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library(25, 15);

        library.addBook("1234", "JCore Java Volume I", "Cay S. Horstmann", 5);
        library.addBook("789064", " Effective Java", "Addison Wesley", 3);
        library.addBook("678934", " Java - The Complete Reference", "Herbert Schildt", 2);
        library.addBook("456734", " Head First Java", "Kathy Sierra & Bert Bates", 4);

        int index = library.findBookByISBN("456734");
        if (index != -1) {
            library.displayBookDetails(index);
        }

        library.checkOutBook(index);
        System.out.println("After check out ");
        library.displayBookDetails(index);

        library.checkInBook(index);
        System.out.println("After Book check In ");
        library.displayBookDetails(index);

        Books bookByTitle = library.searchBookByTitle("Effective Java");
        if (bookByTitle != null) {
            System.out.println("Book found by title: " + bookByTitle);
        }

        Books bookByAuthor = library.searchBookByAuthor("Herbert Schildt");
        if (bookByAuthor != null) {
            System.out.println("Book found by author: " + bookByAuthor);
        }

        System.out.println("Library has the following books : ");
        library.displayAllBooks();


        library.addMember("Ashwini Hegde");
        library.addMember("Surya Nair");

        int memberIndex = library.findMemberById(1);
        System.out.println("The result of finding member with memberId is ");
        if (memberIndex != -1) {
            library.displayMemberDetails(memberIndex);
        }

        System.out.println("Library Members are as follows:");
        library.displayAllMembers();

    }


}
