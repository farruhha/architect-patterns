package farruh.arch.hub.mum.lab6.simple;

public class LoggingProx extends Thing {

    private Thing item;

    public LoggingProx(Thing item) {
        this.item = item;
    }

    @Override
    public void compute(String msg) {
        System.out.println("Logging before proxy");
        item.compute(msg);
        System.out.println("Logging after proxy");
    }
}
