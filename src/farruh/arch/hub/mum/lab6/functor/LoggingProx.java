package farruh.arch.hub.mum.lab6.functor;

public class LoggingProx implements Thing {

    private Thing item;
    private MyFunctor functor;

    public LoggingProx(Thing item, MyFunctor functor) {
        this.item = item;
        this.functor = functor;
    }

    @Override
    public void compute(String msg) {
        functor.message("Logging before proxy");
        // System.out.println("Logging before proxy");
        item.compute(msg);
        functor.message("Logging after proxy");
        //System.out.println("Logging after proxy");
    }
}
