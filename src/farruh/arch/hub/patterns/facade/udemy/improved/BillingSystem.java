package farruh.arch.hub.patterns.facade.udemy.improved;

public class BillingSystem {

    public Bill createBill(int amount) {
        return new Bill(amount);
    }
}
