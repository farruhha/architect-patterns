package farruh.arch.hub.patterns.facade.udemy.improved;

public class FinancialSystemFacade {
    private BillingSystem billingSystem;
    private InvoiceCustomerSystem invoiceCustomerSystem;

    public FinancialSystemFacade() {
        billingSystem = new BillingSystem();
        invoiceCustomerSystem = new InvoiceCustomerSystem();
    }

    public void invoice(int amount) {
        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }

    public void setBillingSystem(BillingSystem billingSystem) {
        this.billingSystem = billingSystem;
    }

    public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
        this.invoiceCustomerSystem = invoiceCustomerSystem;
    }


}
