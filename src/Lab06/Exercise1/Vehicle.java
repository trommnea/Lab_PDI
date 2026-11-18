package Lab06.Exercise1;

public class Vehicle {

	String brand;
	int year;
	Vehicle(){
		this.brand="Unknown";
		this.year=0;
	}
	Vehicle(String brand, int year){
		this.brand=brand;
		this.year=year;
	}
	void start() {
		System.out.println("Brand : "+brand);
		System.out.println("Year : " + year);
	}
}
