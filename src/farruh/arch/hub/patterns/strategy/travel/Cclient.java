package farruh.arch.hub.patterns.strategy.travel;

public class Cclient {
    public static void main(String[] args) {
        TravelContext travelContext = new TravelContext();
        travelContext.setTravelStrategy(new TaxiStrategy());
        travelContext.goToAirport();
    }
}
