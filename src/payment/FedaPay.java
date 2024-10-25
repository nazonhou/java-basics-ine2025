package payment;

public class FedaPay implements PaymentService {
    public boolean pay(double amount) {
        System.out.println("You're using FEDAPAY");
        return true;
    }
}
