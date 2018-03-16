package farruh.arch.hub.patterns.adapter.mobileadapter;

public class ElectricSocket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
