package farruh.arch.hub.mum.lab5;

public class Car {

    private GearState gearState;

    public int changeSpeed(int speed) {
        gearState = NeutralState.getInstance();
        return gearState.accelarateSpeed(speed);
    }

}
    
