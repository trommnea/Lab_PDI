package Lab05;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class SumTask implements Runnable {
    private int n;
    public SumTask(int n) {
        this.n = n;
    }
    public void run() {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }
}

class PrimeTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Prime numbers from 1 to 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class StudentTask implements Runnable {

    public void run() {
        ArrayList<String> students = new ArrayList<>();

        try {
            File file = new File("StudentData.csv");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                students.add(line);
            }

            reader.close();

            System.out.println("\nStudent Information:");

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total students: " + students.size());

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}

public class Exercise08 {

    public static void main(String[] args) {

        SumTask task1 = new SumTask(100);
        PrimeTask task2 = new PrimeTask();
        StudentTask task3 = new StudentTask();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}