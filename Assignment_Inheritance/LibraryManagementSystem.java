package Learnmaxxing.Assignment_Inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LibraryManagementSystem {
    private String userType;
    private String username;
    private String password;
    private static Map<String, String> users = new HashMap<>();
    private static boolean isLoggedIn = false;

    public boolean login(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public boolean register(String username, String password, String userType) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            System.out.println("User registered successfully.");
            return true;
        } else {
            System.out.println("Username already exists.");
            return false;
        }
    }

    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Logout successful.");
        } else {
            System.out.println("No user is logged in.");
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        LibraryDatabase db = new LibraryDatabase();

        lms.register("user1", "password1", "student");
        lms.login("user1", "password1");

        Book book1 = new Book("Java Programming", "Author A", "123456789", "Publication House");

        db.add(book1);
        db.display();

        lms.logout();
    }
}

class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean verify() {
        return id > 0;
    }

    public void checkAccount() {
        System.out.println("Account details for user: " + name);
    }

    public void getBookInfo() {
        System.out.println("Fetching book info for user: " + name);
    }
}

class Librarian extends User {
    private String password;
    private String searchString;

    public Librarian(String name, int id, String password) {
        super(name, id);
        this.password = password;
    }

    public boolean verifyLibrarian() {
        return super.verify() && password != null;
    }

    public void search(String searchString) {
        System.out.println("Librarian searching for: " + searchString);
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    private String publication;

    public Book(String title, String author, String isbn, String publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
    }

    public void showDueDate() {
        System.out.println("Due date for book: " + title + " is 15 days from now.");
    }

    public void reservationStatus() {
        System.out.println("Reservation status for book: " + title + " is available.");
    }

    public void feedback() {
        System.out.println("Feedback for book: " + title + " is positive.");
    }

    public void bookRequest() {
        System.out.println("Request for book: " + title + " has been made.");
    }

    public void renewInfo() {
        System.out.println("Renew information for book: " + title + " is updated.");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}

class Account {
    private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private double fineAmount;

    public Account(int noBorrowedBooks, int noReservedBooks, int noReturnedBooks, int noLostBooks, double fineAmount) {
        this.noBorrowedBooks = noBorrowedBooks;
        this.noReservedBooks = noReservedBooks;
        this.noReturnedBooks = noReturnedBooks;
        this.noLostBooks = noLostBooks;
        this.fineAmount = fineAmount;
    }

    public double calculateFine() {
        fineAmount = noLostBooks * 5.0;
        return fineAmount;
    }
}

class LibraryDatabase {
    private List<Book> listOfBooks;

    public LibraryDatabase() {
        this.listOfBooks = new ArrayList<>();
    }

    public void add(Book book) {
        listOfBooks.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void delete(Book book) {
        listOfBooks.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public void update(Book oldBook, Book newBook) {
        int index = listOfBooks.indexOf(oldBook);
        if (index != -1) {
            listOfBooks.set(index, newBook);
            System.out.println("Book updated: " + newBook.getTitle());
        }
    }

    public void display() {
        System.out.println("Books in the library:");
        for (Book book : listOfBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void search(String searchString) {
        System.out.println("Searching for books with: " + searchString);
        for (Book book : listOfBooks) {
            if (book.getTitle().contains(searchString)) {
                System.out.println("Found: " + book.getTitle());
            }
        }
    }
}

class Staff extends User {
    private String dept;

    public Staff(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

class Student extends User {
    private String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}


