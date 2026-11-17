package Lab05;

class Employee {

    private int id;
    private String name;
    private String gender;
    private String position;
    private double salary;

    Employee(int id, String name, String gender, String position, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

    public class Exercise04{
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", "Male", "Manager", 1500.0);

        // Display employee information using getters
        System.out.println("Employee Information");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Gender: " + emp.getGender());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: $" + emp.getSalary());

        // Update employee information using setters
        emp.setPosition("Senior Manager");
        emp.setSalary(2000.0);

        System.out.println("\nUpdated Information");
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: $" + emp.getSalary());
    }
}