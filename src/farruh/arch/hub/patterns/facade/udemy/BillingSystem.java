package farruh.arch.hub.patterns.facade.udemy;

public class BillingSystem {

    public Bill createBill(int amount) {
        return new Bill(amount);
    }
}
