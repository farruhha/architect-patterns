package farruh.arch.hub.mum.lab6.simple;

public class BThing extends Thing {

    private String name;

    public BThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String msg) {
        System.out.println(msg + " " + name);
    }
}
