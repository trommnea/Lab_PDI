package Lab06.Exercise2;

public class Main {
	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee("heang",1000);
		Manager m1= new Manager("mey",2000);
		Intern i1= new Intern ("long", 500);
		System.out.println("Employee");
		System.out.println(".................");
		e1.print();
		System.out.println(".................");
		e2.print();
		
		System.out.println("\n Manager");
		System.out.println(".................");
		m1.print();
		
		System.out.println("\n Intern");
		System.out.println(".................");
		i1.print();
	}

}
