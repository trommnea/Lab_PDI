package Lab05;

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class Exercise03 {
	    public static void main(String[] args) {
	        Book book1 = new Book();
	        Book book2 = new Book("Harry Potter", "J.K. Rowling", 25.50);
	        System.out.println("Book 1:");
	        book1.display();
	        System.out.println("\nBook 2:");
	        book2.display();
	    }
}