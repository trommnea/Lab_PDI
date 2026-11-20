package Lab06.Exercise6;

public class Circle extends Shape {

    double radius;
    public Circle(double radius) {
        this.radius = radius;

    }

    public double area() {
        return Math.PI * radius * radius;
    }

}
