package farruh.arch.hub.patterns.strategy.travel;

public class TaxiStrategy implements TravelStrategy {
    @Override
    public void goToAirport() {
        System.out.println("By taxi to go");
    }
}
