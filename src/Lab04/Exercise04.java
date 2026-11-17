package Lab04;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Exercise04 {
	public static void main(String[] args) {
		ArrayList<String> student=new ArrayList<>();
		try {
			File file= new File("Ex3StudentData.csv");
			Scanner Read= new Scanner(file);
			
			while(Read.hasNextLine()) {
				String data=Read.nextLine();
				student.add(data);
			}
			Read.close();
			FileWriter fw= new FileWriter("StudentData.csv");
			for(String copy: student) {
				fw.write(copy+"\n");
			}
			fw.close();
			
			System.out.println("Student data from exercise 3: ");
			
			for(String copy: student) {
				System.out.println(copy);
			}
		}
		catch(IOException e) {
			
		}
	}

}
