package Lab05;
import java.util.Scanner;

public class Exercise02 {
	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
                int choice;
                do {
                    System.out.println("\n===== CALCULATOR =====");
                    System.out.println("1. Addition (+)");
                    System.out.println("2. Subtraction (-)");
                    System.out.println("3. Multiplication (*)");
                    System.out.println("4. Division (/)");
                    System.out.println("5. Sum from 1 to n");
                    System.out.println("0. Exit");
                    System.out.print("Choose an operation: ");

                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the first numbers: ");
                            double a = input.nextDouble();
                            System.out.print("Enter the second numbers: ");
                            double b = input.nextDouble();
                            System.out.println("Result: " + (a + b));
                            break;

                        case 2:
                        	System.out.print("Enter the first numbers: ");
                            double c = input.nextDouble();
                            System.out.print("Enter the second numbers: ");
                            double d = input.nextDouble();
                            System.out.println("Result: " + (c - d));
                            break;

                        case 3:
                        	System.out.print("Enter the first numbers: ");
                            double e = input.nextDouble();
                            System.out.print("Enter the second numbers: ");
                            double f = input.nextDouble();
                            System.out.println("Result: " + (e * f));
                            break;

                        case 4:
                        	System.out.print("Enter the first numbers: ");
                            double g = input.nextDouble();
                            System.out.print("Enter the second numbers: ");
                            double h = input.nextDouble();

                            if (h != 0) {
                                System.out.println("Result: " + (g / h));
                            } 
                            else {
                                System.out.println("Cannot divide by zero!");
                            }
                            break;

                        case 5:
                            System.out.print("Enter n: ");
                            int n = input.nextInt();
                            int sum = 0;

                            for (int i = 1; i <= n; i++) {
                                sum += i;
                            }
                            System.out.println("Sum from 1 to " + n + ": " + sum);
                            break;

                        case 0:
                            System.out.println("Exiting calculator...");
                            break;

                        default:
                            System.out.println("Invalid choice! Try again.");
                    }
                } while (choice != 0);
                input.close();
            }
	    }
}
