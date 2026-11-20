package Lab06.Exercise8;

public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String get_info() {
        return "Product: " + name + ", Price: $" + price;

    }

}