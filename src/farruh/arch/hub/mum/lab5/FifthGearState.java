package farruh.arch.hub.mum.lab5;

public class FifthGearState implements GearState {

    private int gear = 5;
    private static GearState gearState;

    private static FifthGearState fifthGearState = new FifthGearState();

    public static GearState getInstance() {
        return fifthGearState;
    }

    private FifthGearState() {
    }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public int accelarateSpeed(int speed) {
        if (speed >= 60) {
            return getGear();
        }
        gearState = NeutralState.getInstance();
        return gearState.accelarateSpeed(0);
    }
}
