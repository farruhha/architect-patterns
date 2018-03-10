package farruh.arch.hub.mum.test;

public class BThing implements Thing {

    private String name;

    public BThing(String name){
        this.name = name;
    }

    @Override
    public void compute(String msg) {
        System.out.println(msg + " " + name);
    }
}
