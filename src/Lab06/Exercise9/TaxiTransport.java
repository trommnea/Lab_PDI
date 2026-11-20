package Lab06.Exercise9;

public class TaxiTransport extends Transport {

    public TaxiTransport(double distance) {

        super(distance);

    }

    double calculate_fare() {

        return 20 + (distance * 5);

    }

}
