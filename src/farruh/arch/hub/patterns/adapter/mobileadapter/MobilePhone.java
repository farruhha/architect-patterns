package farruh.arch.hub.patterns.adapter.mobileadapter;

public class MobilePhone {

    public static void main(String[] args) {
        new MobilePhone().chargeMe();
    }

    public void chargeMe(){
        ITarget iTarget = new MobilePhoneCharger();
        Volt volt = iTarget.getVolt();

        System.out.println("Volt for charging " + volt.getVolts());
    }
}
