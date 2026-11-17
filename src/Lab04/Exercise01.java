package Lab04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		File file = new File("LuckyNumber.csv");
		try{
			Random random=new Random();
			FileWriter fw = new FileWriter(file,true);
			Scanner read= new Scanner(file);
			
			for(int i=0;i<500;i++) {
				int num=random.nextInt(500)+2;
				fw.write(num+"\n");
			}
			System.out.println("500 random numbers have been saved.");
			System.out.println("These are your 500 random numbers: ");
			
			int count=0;
			while(read.hasNextLine()) {
				String Number=read.nextLine();
				System.out.println(Number);
				count++;
			}	
			fw.close();
			read.close();
		}

		catch (IOException e) {
		}
	}
}
