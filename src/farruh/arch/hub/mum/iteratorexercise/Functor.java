package farruh.arch.hub.mum.iteratorexercise;

public interface Functor<T,R> {

    void compute(T element);

    R getValue();


}
