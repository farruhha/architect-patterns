package farruh.arch.hub.patterns.strategy.travel;

public class BusTravelStrategy implements TravelStrategy {
    @Override
    public void goToAirport() {
        System.out.println("Bus travel strategy");
    }
}
