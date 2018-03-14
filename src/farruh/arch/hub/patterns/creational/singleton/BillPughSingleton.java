package farruh.arch.hub.patterns.creational.singleton;

public class BillPughSingleton {

    private static class InstanceClass{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton(){}

    public static BillPughSingleton getInstance(){
        return InstanceClass.INSTANCE;
    }
}
