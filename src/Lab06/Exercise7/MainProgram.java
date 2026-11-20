package Lab06.Exercise7;
public class MainProgram {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();

        Payment p2 = new PayPalPayment();

        Payment p3 = new BankTransferPayment();

        p1.process_payment(100);

        p2.process_payment(200);

        p3.process_payment(300);

    }

}