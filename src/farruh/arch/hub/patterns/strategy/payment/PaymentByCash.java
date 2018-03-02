package farruh.arch.hub.patterns.strategy.payment;

public class PaymentByCash implements PaymentStrategy {
    @Override
    public void pay(String amount) {
        System.out.println("By cash");
    }
}
