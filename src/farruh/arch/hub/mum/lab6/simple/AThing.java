package farruh.arch.hub.mum.lab6.simple;

public class AThing extends Thing {

    private String name;

    public AThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String msg) {
        System.out.println(msg + " inside the proxy" + name);
    }
}
