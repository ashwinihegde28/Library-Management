# Library-Management-Arrays
This project is a simple Library Management System implemented using basic datastructures - Arrays in Java. The system allows you to manage books and library members with basic functionalities like adding books and members, searching for books and members, checking out and checking in books, and displaying details.

### Project Structure
1. **Books.java**
   - Description: Represents a book in the library.
   - Fields:
     1) isbn: Unique identifier for the book.
     2) title: Title of the book.
     3) author: Author of the book.
     4) availableCopies: Number of copies available in the library.
   -  Methods:
      1) toString(): Overridden method, provides a string representation of the book details.
   -  Constructor: Initializes a book with its ISBN, title, author, and available copies.
         
2. **Member.java**
   - Description: Represents a member of the library.
   - Fields:
     1) memberId: Unique identifier for the member.
     2) name: Name of the member.
     3) fines: Fine amount due by the member (if any).
   - Methods:
     1) toString(): Provides a string representation of the member details.
   - Constructor: Initializes a member with their name.
   
3. **Library.java**
   - Description: Manages the collection of books and members in the library.
   - Fields:
     1) Books[] books: Array to store book objects.
     2) Member[] members: Array to store member objects.
     3) bookCount: Tracks the current number of books in the library.
     4) memberCnt: Tracks the current number of members in the library.
     5) memberIdCntr: Counter for generating unique member IDs.
   - Methods:
      * Book Management:
     1) addBook(): Adds a book to the library.
     2) findBookByISBN(): Finds a book by its ISBN.
     3) checkOutBook(): Checks out a book.
     4) checkInBook(): Checks in a book.
     5) displayBookDetails(): Displays details of a specific book.
     6) displayAllBooks(): Displays details of all books.
     7) searchBookByTitle(): Searches for a book by its title.
     8) searchBookByAuthor(): Searches for a book by its author.
      * Member Management:
     1) addMember(): Adds a member to the library.
     2) findMemberById(): Finds a member by their ID.
     3) displayMemberDetails(): Displays details of a specific member.
     4) displayAllMembers(): Displays details of all members.

### How to Run
   - Compile the Java files.
   - Run the Library class, which contains the main method.
   - The main method demonstrates adding books and members, searching, checking out and checking in books, and displaying the information.

### Some basic Git commands used are:
```
git status
git add
git commit
```
