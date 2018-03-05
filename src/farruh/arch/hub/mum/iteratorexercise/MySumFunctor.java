package farruh.arch.hub.mum.iteratorexercise;

public class MySumFunctor implements Functor<Integer, Double> {

    private Double summation = 0.0;

    @Override
    public void compute(Integer element) {
        summation = summation + element;
    }

    @Override
    public Double getValue() {
        return summation;
    }
}
