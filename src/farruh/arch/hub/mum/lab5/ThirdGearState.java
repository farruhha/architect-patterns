package farruh.arch.hub.mum.lab5;

public class ThirdGearState implements GearState {

    private int gear = 3;
    private static GearState gearState;

    private static ThirdGearState thirdGearState = new ThirdGearState();

    public static GearState getInstance(){
        return thirdGearState;
    }
    private ThirdGearState() {
    }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public int accelarateSpeed(int speed) {
        if (speed >= 20 & speed < 40) {
            return getGear();
        }
        gearState = FourthGearState.getInstance();
        return gearState.accelarateSpeed(speed);
    }
}
