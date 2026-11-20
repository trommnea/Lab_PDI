package Lab06.Exercise4;
public class SavingsAccount extends BankAccount {

    double interest_rate;

    public SavingsAccount(String account_number, double balance, double interest_rate) {

        super(account_number, balance);

        this.interest_rate = interest_rate;

    }

}