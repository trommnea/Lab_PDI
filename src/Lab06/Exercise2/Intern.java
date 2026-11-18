package Lab06.Exercise2;

public class Intern extends Employee{
	Intern(String name, double Salary){
		super(name, Salary);
	}
	public double calculate_bonus(){
		return Salary * 0.05;
	}

}
