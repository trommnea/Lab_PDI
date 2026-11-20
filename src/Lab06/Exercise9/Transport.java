package Lab06.Exercise9;

abstract class Transport {
    double distance;

    public Transport(double distance) {

        this.distance = distance;

    }

    abstract double calculate_fare();

    public void display_fare() {

        System.out.println(

            getClass().getSimpleName() +

            " | Distance: " + distance + " km" +

            " | Fare: $" + calculate_fare()

        );

    }

}