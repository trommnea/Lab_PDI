package Lab05;

import java.util.Arrays;
import java.util.List;

public class Exercise09 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);

        // a) Find the cube of each number
        System.out.println("Cube of each number:");
        numbers.stream()
               .map(n -> n * n * n)
               .forEach(System.out::println);

        // b) Filter out positive numbers
        System.out.println("\nPositive numbers:");
        numbers.stream()
               .filter(n -> n > 0)
               .forEach(System.out::println);

        // c) Sort the list
        System.out.println("\nSorted numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}