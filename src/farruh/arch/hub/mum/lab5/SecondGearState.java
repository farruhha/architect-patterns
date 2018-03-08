package farruh.arch.hub.mum.lab5;

public class SecondGearState implements GearState {

    private int gear = 2;
    private static GearState gearState;

    private static SecondGearState secondGearState = new SecondGearState();
    public static GearState getInstance(){
        return secondGearState;
    }

    private SecondGearState() { }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public int accelarateSpeed(int speed) {
        if (speed >= 10 & speed < 20) {
            return getGear();
        }
        gearState = ThirdGearState.getInstance();
        return gearState.accelarateSpeed(speed);
    }
}
