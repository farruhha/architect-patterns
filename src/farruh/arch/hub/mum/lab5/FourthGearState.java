package farruh.arch.hub.mum.lab5;

public class FourthGearState implements GearState {

    private int gear = 4;
    private static GearState gearState;

    private static FourthGearState fourthGearState = new FourthGearState();

    public static GearState getInstance() {
        return fourthGearState;
    }

    private FourthGearState() {
    }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public int accelarateSpeed(int speed) {
        if (speed >= 40 && speed < 60) {
            return getGear();
        }
        gearState = FifthGearState.getInstance();
        return gearState.accelarateSpeed(speed);
    }
}
