package Lab06.Exercise2;

public class Manager extends Employee{
	Manager(String name, double Salary){
		super(name, Salary);
	}
	public double caculate_bonus() {
		return Salary * 0.2;	
	}
}
