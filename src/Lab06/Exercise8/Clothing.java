package Lab06.Exercise8;

public class Clothing extends Product {
    String size;
    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;

    }

    public String get_info() {

        return "Clothing: " + name +

               ", Price: $" + price +

               ", Size: " + size;

    }

}