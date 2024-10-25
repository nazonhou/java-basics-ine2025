package payment;

public class InePay implements PaymentService {
    @Override
    public boolean pay(double amount) {
        System.out.println("You're using INEPAY");
        return false;
    }
}
