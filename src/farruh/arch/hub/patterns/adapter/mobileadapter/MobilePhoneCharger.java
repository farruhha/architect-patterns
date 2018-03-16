package farruh.arch.hub.patterns.adapter.mobileadapter;

public class MobilePhoneCharger implements ITarget {

    private ElectricSocket electricSocket = new ElectricSocket();

    @Override
    public Volt getVolt() {
        Volt volt = electricSocket.getVolt();
        Volt convertedVolt = getConvertedVolt(volt, 13);
        return convertedVolt;
    }

    private Volt getConvertedVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
