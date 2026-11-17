package Lab04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise02 {
	public static void main (String[] args) {
		try {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=input.nextInt();
		String name;
		
			for(int i=1;i<=num;i++) {
				name="file"+i+".csv";
				File f =new File(name);
				if (f.createNewFile()) {
					System.out.println("created.");
				}
			}
		input.close();
		}
		catch(IOException e) {
				
		}
	}
}
