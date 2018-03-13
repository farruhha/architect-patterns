package farruh.arch.hub.mum.lab6.generics;

public class AThing<T> implements Thing<T> {

    private String name;

    public AThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(T msg) {
        System.out.println(msg + " inside the proxy" + name);
    }
}
