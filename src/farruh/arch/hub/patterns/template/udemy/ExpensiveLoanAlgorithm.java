package farruh.arch.hub.patterns.template.udemy;

public class ExpensiveLoanAlgorithm extends LoanCalculationAlgorithm {
    @Override
    int getBaseAmount() {
        return 1000;
    }

    @Override
    double getInterest() {
        return 0.5;
    }

    @Override
    int calculateDiscount() {
        return 10;
    }
}
