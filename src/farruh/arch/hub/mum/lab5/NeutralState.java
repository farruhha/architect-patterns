package farruh.arch.hub.mum.lab5;

public class NeutralState implements GearState {

    private int gear = 0;
    private static GearState gearState;
    private static NeutralState neutralState = new NeutralState();

    public static NeutralState getInstance() {
        return neutralState;
    }

    private NeutralState() {

    }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public int accelarateSpeed(int speed) {
        if (speed == 0) {
            return getGear();
        }
        gearState = FirstGearState.getInstance();
        return gearState.accelarateSpeed(speed);
    }
}
