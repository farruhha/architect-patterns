package farruh.arch.hub.patterns.strategy.udemy;

public class Client {
    public static void main(String[] args) {
        Chess chess = new Chess();
        System.out.println("Next step : "+chess.calculateNextStep());
    }
}
