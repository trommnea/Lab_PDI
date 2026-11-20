package Lab06.Exercise8;

public class Electronics extends Product {

    int warranty;
    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;

    }

    public String get_info() {

        return "Electronics: " + name +
               ", Price: $" + price +
               ", Warranty: " + warranty + " years";
    }
}