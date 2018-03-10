package farruh.arch.hub.mum.test;

public class LoggingProx implements Thing {

    private Thing item;

    public LoggingProx(Thing item) {
        this.item = item;
    }

    @Override
    public void compute(String msg) {
        System.out.println("Logging all the process the message" + item.getClass());
        item.compute(msg);
    }
}
