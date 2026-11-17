package Lab04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07 {
    static ArrayList<String[]> candidates = new ArrayList<>();

    public static void readFile() throws IOException {
        File file = new File("CandidatePerformanceTest.csv");
        Scanner input = new Scanner(file);

        input.nextLine();
        input.nextLine();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.trim().isEmpty()) {
                continue;
            }
            String[] data = line.split(",");
            candidates.add(data);
        }
        input.close();
    }

    public static int countGroup(ArrayList<String[]> candidates, String group) {
        int count = 0;
        for (String[] data : candidates) {
            if (data[2].trim().equalsIgnoreCase(group)) {
                count++;
            }
        }
        return count;
    }

    public static int countGroupMale(ArrayList<String[]> candidates, String group) {
        int count = 0;
        for (String[] data : candidates) {
            if (data[2].trim().equalsIgnoreCase(group) && data[1].trim().equalsIgnoreCase("male")) {
                count++;
            }
        }
        return count;
    }

    public static int countGroupFemale(ArrayList<String[]> candidates, String group) {
        int count = 0;
        for (String[] data : candidates) {
            if (data[2].trim().equalsIgnoreCase(group) && data[1].trim().equalsIgnoreCase("female")) {
                count++;
            }
        }
        return count;
    }

    public static double percentage(int count, int total) {
        if (total == 0) {
            return 0;
        }
        return (double) count / total * 100;
    }

    public static void writeGroup(String group) throws IOException {
        String filename = "group" + group.substring(group.lastIndexOf(" ") + 1) + ".csv";
        FileWriter fw = new FileWriter(filename);
        fw.write("ID,gender,group,Education,test preparationcourse,Math,English,Computer,Total,Average\n");

        int total = 0;
        int male = 0;
        int female = 0;

        for (String[] student : candidates) {
            if (student[2].trim().equalsIgnoreCase(group)) {
                fw.write(String.join(",", student) + "\n");
                total++;

                if (student[1].trim().equalsIgnoreCase("male")) {
                    male++;
                }
                else if (student[1].trim().equalsIgnoreCase("female")) {
                    female++;
                }
            }
        }

        fw.write("\n");
        fw.write("Summary\n");
        fw.write("Total students," + total + "\n");
        fw.write("Male," + male + "\n");
        fw.write("Female," + female + "\n");

        double malePercent = percentage(male, total);
        double femalePercent = percentage(female, total);

        fw.write("Male percentage," + String.format("%.2f%%", malePercent) + "\n");
        fw.write("Female percentage," + String.format("%.2f%%", femalePercent) + "\n");
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        readFile();
        ArrayList<String> groups = new ArrayList<>();

        for (String[] data : candidates) {
            String group = data[2].trim();
            if (!groups.contains(group)) {
                groups.add(group);
            }
        }

        for (String group : groups) {

            int groupTotal = countGroup(candidates, group);
            int groupMale = countGroupMale(candidates, group);
            int groupFemale = countGroupFemale(candidates, group);

            System.out.println(group);
            System.out.println("Total students: " + groupTotal);
            System.out.printf("Male Candidates: %.2f%%%n", percentage(groupMale, groupTotal));
            System.out.printf("Female Candidates: %.2f%%%n", percentage(groupFemale, groupTotal));
            System.out.println();
        }

        for (String group : groups) {
            writeGroup(group);
        }

        int totalMale = 0;
        int totalFemale = 0;
        for (String[] student : candidates) {
            if (student[1].trim().equalsIgnoreCase("male")) {
                totalMale++;
            }
            else if (student[1].trim().equalsIgnoreCase("female")) {
                totalFemale++;
            }
        }

        System.out.println("Overall Gender Statistics:");
        System.out.printf("Male: %.2f%%%n", percentage(totalMale, candidates.size()));
        System.out.printf("Female: %.2f%%%n", percentage(totalFemale, candidates.size()));
        System.out.println("\nCSV files created successfully!");
    }
}