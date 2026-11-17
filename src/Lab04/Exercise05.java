package Lab04;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;

public class Exercise05 {
	public static void main(String[] args) {
		File file=new File("StudentData.csv");
		ArrayList<String> student=new ArrayList<>();
		try {
			Scanner read=new Scanner(file);
			String Header=read.nextLine();
			while(read.hasNextLine()) {
				student.add(read.nextLine());
				
			}
			read.close();
			
			student.add("Mey,023,F");
			student.add("Dara,528,M");
			student.add("Chouzz,423,F");
			Collections.sort(student);
			FileWriter fw =new FileWriter(file);
			fw.write(Header+"\n");
			for(String data : student) {
				fw.write(data+"\n");
			}
			fw.close();
			System.out.println("added 3 more student and sorted data successfully.");
		
		}
		catch (IOException e) {
			
		}

	}
		
}
