package farruh.arch.hub.mum.iteratorexercise;

public class MyAverageFunctor implements Functor<Integer, Double> {
    private double sum = 0.0;
    private int counter = 0;

    @Override
    public void compute(Integer element) {
        sum = sum + element;
        counter++;
    }

    @Override
    public Double getValue() {
        return sum / counter;
    }
}
