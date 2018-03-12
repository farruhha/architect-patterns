package farruh.arch.hub.patterns.facade.udemy;

public class InvoiceCustomerSystem {

    public void createInvoiceForBill(Bill bill){
        System.out.println("Billing Invoice");
        System.out.println("Current bill amount : $" + bill.getAmount());
    }
}
