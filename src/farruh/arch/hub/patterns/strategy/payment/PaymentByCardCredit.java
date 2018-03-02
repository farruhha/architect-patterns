package farruh.arch.hub.patterns.strategy.payment;

public class PaymentByCardCredit implements PaymentStrategy {
    @Override
    public void pay(String amount) {
        System.out.println("By credit card");
    }
}
