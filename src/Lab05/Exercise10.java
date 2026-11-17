package Lab05;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        try {
            File file = new File("StudentData.csv");
            Scanner sc = new Scanner(file);

            sc.nextLine();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");

                students.add(data[0]);
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("File not found!");
        }

        System.out.println("Students in A-Z order:");

        students.stream()
                .sorted()
                .forEach(System.out::println);
    }
}