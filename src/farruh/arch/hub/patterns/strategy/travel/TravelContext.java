package farruh.arch.hub.patterns.strategy.travel;

public class TravelContext {
    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void goToAirport(){
        travelStrategy.goToAirport();
    }
}
