package farruh.arch.hub.patterns.strategy.udemy.improved;

public class Client {
    public static void main(String[] args) {
        AlgorithmContext algorithmContext = new AlgorithmContext(new HardAlgorithm());
        Chess chess = new Chess(algorithmContext);
        System.out.println("Next step : " + chess.calculateNextStep());
    }
}
