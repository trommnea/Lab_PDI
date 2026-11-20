package Lab06.Exercise4;

public class MainProgram {

	    public static void main(String[] args) {

	        SavingsAccount savings = new SavingsAccount("ACC001", 5000.0, 3.5);

	        System.out.println("Account Number: " + savings.account_number);

	        System.out.println("Balance: $" + savings.balance);

	        System.out.println("Interest Rate: " + savings.interest_rate + "%");

	    }

}
