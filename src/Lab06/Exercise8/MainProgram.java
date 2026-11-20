package Lab06.Exercise8;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics("Laptop", 1000, 2));

        products.add(new Clothing("T-Shirt", 15, "M"));

        products.add(new Book("Java Basics", 25, "John Smith"));

        for (Product p : products) {

            System.out.println(p.get_info());

        }

    }

}