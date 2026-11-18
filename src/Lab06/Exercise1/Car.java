package Lab06.Exercise1;

public class Car extends Vehicle {

	int num_door;
	
	Car(){
		this.num_door=0;
	}
	
	Car(int num_door){
		this.num_door=num_door;
	}
	
	void honk() {
		System.out.println("beep beep");
	}
}
