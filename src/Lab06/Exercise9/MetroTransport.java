package Lab06.Exercise9;

public class MetroTransport extends Transport {

    public MetroTransport(double distance) {

        super(distance);

    }


    double calculate_fare() {

        return 10 + (distance * 2);

    }

}