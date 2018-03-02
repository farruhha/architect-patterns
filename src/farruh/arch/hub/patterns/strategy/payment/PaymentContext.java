package farruh.arch.hub.patterns.strategy.payment;

public class PaymentContext {
    PaymentStrategy strategy;

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(String amount) {
        strategy.pay(amount);
    }
}
