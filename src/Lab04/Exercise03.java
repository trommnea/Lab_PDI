package Lab04;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        File file = new File("Ex3StudentData.csv");
        try {
            FileWriter fw = new FileWriter(file);
            Scanner input = new Scanner(System.in);
            
            if(file.length()==0) {
            	fw.write("Name,ID,Gender\n");

            	for (int i = 1; i <= 3; i++) {

                	System.out.println("Enter information for team member number " + i);
                	
                	System.out.print("Name: ");
                	String name = input.nextLine();
                	
                	System.out.print("ID: ");
                	int id = input.nextInt();
                	input.nextLine();

                	System.out.print("Gender: ");
                	String gender = input.nextLine();

                	fw.write(name + "," + id + "," + gender + "\n");
            	}
            }
            fw.close();
            input.close();
            System.out.println("Student data has been saved successfully!");
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
