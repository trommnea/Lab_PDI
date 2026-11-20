package Lab06.Exercise8;

public class Book extends Product {

    String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;

    }

    public String get_info() {
        return "Book: " + name +

               ", Price: $" + price +

               ", Author: " + author;

    }

}