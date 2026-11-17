package Lab05;
public class Exercise05 {

    public static long factorialProcedural(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {

        int[] numbers = {3, 6, 10, 50};

        System.out.println("Number\tProcedural\tRecursive");

        for (int n : numbers) {
            System.out.println(n + "\t" +
                factorialProcedural(n) + "\t" +
                factorialRecursive(n));
        }
    }
}