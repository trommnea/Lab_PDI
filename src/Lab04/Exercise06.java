package Lab04;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise06 {

    public static ArrayList<String> readData(File file) throws IOException {
        ArrayList<String> candidates = new ArrayList<>();
        Scanner read = new Scanner(file);
            read.nextLine();
            read.nextLine();
            
        while (read.hasNextLine()) {
            String data = read.nextLine();
            
            if (!data.trim().isEmpty()) {
                candidates.add(data);
            }
        }

        read.close();
        return candidates;
    }

    public static int totalCandidates(ArrayList<String> candidates) {
        return candidates.size();
    }

    public static int countMale(ArrayList<String> candidates) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            
            if (parts[1].trim().equalsIgnoreCase("male")) {
                count++;
            }
        }
        return count;
    }

    public static int countFemale(ArrayList<String> candidates) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            
            if (parts[1].trim().equalsIgnoreCase("female")) {
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

    public static int countAverage90(ArrayList<String> candidates) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            
            double average = Double.parseDouble(parts[9].trim());
            if (average >= 90) {
                count++;
            }
        }
        return count;
    }

    public static int countMale90(ArrayList<String> candidates) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            double average = Double.parseDouble(parts[9].trim());
            if (parts[1].trim().equalsIgnoreCase("male") && average >= 90) {
                count++;
            }
        }
        return count;
    }

    public static int countFemale90(ArrayList<String> candidates) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            double average = Double.parseDouble(parts[9].trim());
            if (parts[1].trim().equalsIgnoreCase("female") && average >= 90) {
                count++;
            }
        }
        return count;
    }

    public static void countSubject85(ArrayList<String> candidates) {
        int Subject=0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            if (Double.parseDouble(parts[5].trim()) >= 85  && Double.parseDouble(parts[6].trim()) >= 85  && Double.parseDouble(parts[7].trim()) >= 85) {
                Subject++;
            }
        }

        System.out.println("Candidates with scores for each subject at least 85: "+Subject);
    }

    public static int countGroup(ArrayList<String> candidates, String group) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            if (parts[2].trim().equalsIgnoreCase(group)) {
                count++;
            }
        }
        return count;
    }

    public static int countGroupMale(ArrayList<String> candidates, String group) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            if (parts[2].trim().equalsIgnoreCase(group)
                    && parts[1].trim().equalsIgnoreCase("male")) {
                count++;
            }
        }
        return count;
    }

    public static int countGroupFemale(ArrayList<String> candidates, String group) {
        int count = 0;
        for (String data : candidates) {
            String[] parts = data.split(",");
            if (parts[2].trim().equalsIgnoreCase(group) && parts[1].trim().equalsIgnoreCase("female")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            File file = new File("CandidatePerformanceTest.csv");
            ArrayList<String> candidates = readData(file);
            
            int total = totalCandidates(candidates);
            int male = countMale(candidates);
            int female = countFemale(candidates);
            System.out.println("===== ANSWER 1 =====");
            System.out.println("Total Candidates: " + total);
            System.out.printf("Male Candidates: %.2f%%%n", percentage(male, total));
            System.out.printf("Female Candidates: %.2f%%%n", percentage(female, total));

 
            int average90 = countAverage90(candidates);
            int male90 = countMale90(candidates);
            int female90 = countFemale90(candidates);
            System.out.println("\n===== ANSWER 2 =====");
            System.out.println("Candidates with average score at least 90: " + average90);
            System.out.printf("Male Candidates: %.2f%%%n", percentage(male90, average90));
            System.out.printf("Female Candidates: %.2f%%%n", percentage(female90, average90));

            System.out.println("\n===== ANSWER 3 =====");
            countSubject85(candidates);


            System.out.println("\n===== ANSWER 4 =====");
            ArrayList<String> groups = new ArrayList<>();
            for (String data : candidates) {
                String[] parts = data.split(",");
                String group = parts[2].trim();
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
                System.out.printf("Male Candidates: %.2f%%%n",percentage(groupMale, groupTotal));
                System.out.printf("Femal Candidates: %.2f%%%n",percentage(groupFemale, groupTotal));
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}