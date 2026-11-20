package Lab06.Exercise9;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {

        ArrayList<Transport> transports = new ArrayList<>();

        transports.add(new BusTransport(10));

        transports.add(new MetroTransport(10));

        transports.add(new TaxiTransport(10));

        transports.add(new BusTransport(20));

        transports.add(new MetroTransport(15));

        transports.add(new TaxiTransport(5));

        for (Transport t : transports) {

            t.display_fare();

        }

    }

}