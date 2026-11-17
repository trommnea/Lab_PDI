package Lab05;
import java.util.stream.IntStream;

public class Exercise11 {
    public static void main(String[] args) {

        int[] numbers = {51, 92, 39, 21, 53, 78};

        // Find maximum number
        int max = IntStream.of(numbers).max().getAsInt();

        // Find minimum number
        int min = IntStream.of(numbers).min().getAsInt();

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}