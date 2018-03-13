package farruh.arch.hub.mum.lab6.generics;

public class LoggingProx<T> implements Thing<T> {

    private Thing<T> item;
    private MyFunctor functor;

    public LoggingProx(Thing<T> item, MyFunctor functor) {
        this.item = item;
        this.functor = functor;
    }

    @Override
    public void compute(T msg) {
        functor.message("Logging before proxy");
        // System.out.println("Logging before proxy");
        item.compute(msg);
        functor.message("Logging after proxy");
        //System.out.println("Logging after proxy");
    }
}
