package farruh.arch.hub.patterns.facade.udemy.improved;

public class Client {

    public static void main(String[] args) {
        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
        financialSystemFacade.invoice(3200);
    }
}
