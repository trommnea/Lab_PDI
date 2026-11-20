package Lab06.Exercise1;

public class MainProgram {

	    public static void main(String[] args) {

	        Vehicle v = new Vehicle("Toyota", 2020);

	        v.start();
	        Car c = new Car("BMW", 2024, 4);

	        c.start(); 
	        c.honk();   
	        System.out.println("Brand: " + c.brand);

	        System.out.println("Year: " + c.year);

	        System.out.println("Number of doors: " + c.num_door);

	    }

}
