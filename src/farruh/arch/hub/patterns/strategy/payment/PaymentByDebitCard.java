package farruh.arch.hub.patterns.strategy.payment;

public class PaymentByDebitCard implements PaymentStrategy {
    @Override
    public void pay(String amount) {
        System.out.println("Payment by card");
    }
}
