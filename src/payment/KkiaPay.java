package payment;

public class KkiaPay implements PaymentService {
    public boolean pay(double amount) {
        System.out.println("You're using KKIAPAY");
        return true;
    }
}
