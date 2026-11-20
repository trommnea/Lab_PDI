package Lab06.Exercise9;

public class BusTransport extends Transport {

    public BusTransport(double distance) {

        super(distance);

    }

    double calculate_fare() {

        return distance * 1.5;

    }

}