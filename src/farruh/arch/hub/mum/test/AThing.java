package farruh.arch.hub.mum.test;

public class AThing implements Thing {

    private String name;

    public AThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String msg) {
        System.out.println(msg + " " + name);
    }
}
