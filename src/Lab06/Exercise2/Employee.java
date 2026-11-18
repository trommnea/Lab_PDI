package Lab06.Exercise2;

public class Employee {
	String name;
	double Salary;
	
	Employee(){
		this.name="Unknown";
		this.Salary=0;
	}

	Employee(String name,double Salary){
		this.name=name;
		this.Salary=Salary;
	}
	public double caculate_bonus() {
		return Salary * 0.1;
	}
	void print(){
		System.out.println("Name: "+name);
		System.out.println("Salary : "+(Salary+caculate_bonus()));
	}

}
