package Encapsulation;


public class Main {

    public static void main(String[] args) {
        
        Book b1 = new Book("Java Programming",
                            "John Smith",
                            2021,
                            39.99);

        Book b2 = new Book("Python Basics",
                            "John Doe",
                            2020,
                            29.99);

        Book b3 = new Book("C++ Essentials",
                            "Michael Johnsons",
                            2019,
                            49.99);
        
        System.out.println("\nBook 1");
        showDetails(b1);

        System.out.println("\nBook 2");
        showDetails(b2);

        System.out.println("\nBook 3");
        showDetails(b3);
        
    }

    

    
}
