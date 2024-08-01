package Learnmaxxing.Assignment_Classes_and_Objects_and_Constructors;

import java.util.ArrayList;
import java.util.Scanner;
public class BookDTOMain{
    public static ArrayList<BookDTO> books = new ArrayList<>();
    public static int bookCount = 0;
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO();
        BookDTO book2 = new BookDTO("book2", "456", "Him", 700);
        System.out.println("Total number of books: " + bookCount);
        System.out.println(books);
        displaylog(books);
    }
    public static String printer(BookDTO book){
        return "title = '" + book.getTitle() + '\'' +
                ", isbn = '" + book.getIsbn() + '\'' +
                ", author = '" + book.getAuthor() + '\'' +
                ", price = " + book.getPrice();
    }
    public static void displaylog(ArrayList<BookDTO> books){
        for (BookDTO book : books){
            System.out.println(printer(book));
        }
    }
}
class BookDTO {
    private String title;
    private String isbn;
    private String author;
    private double price;
    public BookDTO(String title, String isbn, String author, double price) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        BookDTOMain.books.add(BookDTOMain.bookCount, this);
        BookDTOMain.bookCount++;
    }
    public BookDTO(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book Title : ");
        this.title = scanner.nextLine();
        System.out.println("Enter book Isbn : ");
        this.isbn = scanner.nextLine();
        System.out.println("Enter book Author : ");
        this.author = scanner.nextLine();
        System.out.println("Enter book Price : ");
        this.price = scanner.nextInt();
        BookDTOMain.books.add(BookDTOMain.bookCount, this);
        BookDTOMain.bookCount++;
    };

    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}
