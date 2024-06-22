package Encapsulation;

public class Book {

    String title;
    String author;
    int yearPublished;
    double price;



    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }  

    static void showDetails(Book book){

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Year Published: " + book.yearPublished);
        System.out.println("Price: " + book.price);
    
    }

    
}


