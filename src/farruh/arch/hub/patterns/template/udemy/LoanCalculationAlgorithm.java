package farruh.arch.hub.patterns.template.udemy;

public abstract class LoanCalculationAlgorithm {
    final public int calculatePayrole() {
        return (int) (getBaseAmount() * getInterest() - calculateDiscount());
    }

    abstract int getBaseAmount();

    abstract double getInterest();

    abstract int calculateDiscount();
}
