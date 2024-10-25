package model;

import payment.FedaPay;
import payment.InePay;
import payment.KkiaPay;
import payment.PaymentService;

public class IneStudent extends Student {
    public static double getScholarship() {
        return 1000.0;
    }

    private double amountPayed = 0.0;

    public boolean pass(double minAverageRequired) {
        if (this.getAverage() >= minAverageRequired) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pass() {
        if (this.getAverage() >= 12.0) {
            return true;
        } else {
            return false;
        }
    }

    public double payScholarship(double amount, String paymentMethod) {
        int i = 2 / 0;
        PaymentService paymentService;

        switch (paymentMethod) {
            case "FEDAPAY":
                paymentService = new FedaPay();
                break;
            case "KKIAPAY":
                paymentService = new KkiaPay();
                break;
            case "INEPAY":
                paymentService = new InePay();
                break;
            default:
                paymentService = new KkiaPay();
        }

        if (paymentService.pay(amount)) {
            amountPayed = amountPayed + amount;
            return getScholarship() - amountPayed;
        }

        return getScholarship() - amountPayed;
    }
}
