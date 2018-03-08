package farruh.arch.hub.mum.lab5;

public class FirstGearState implements GearState {

    private int gear = 1;
    private static GearState secondGearState;
    private static FirstGearState firstGearState = new FirstGearState();

    public static GearState getInstance() {
        return firstGearState;
    }

    public int getGear() {
        return gear;
    }


    private FirstGearState() {
    }

    @Override
    public int accelarateSpeed(int speed) {
        if (speed > 0 & speed < 10) {
            return getGear();
        }
        secondGearState = SecondGearState.getInstance();
        return secondGearState.accelarateSpeed(speed);

    }
}
