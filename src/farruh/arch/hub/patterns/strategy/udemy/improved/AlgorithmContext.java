package farruh.arch.hub.patterns.strategy.udemy.improved;

public class AlgorithmContext {

    private ChessAlgorithm chessAlgorithm;

    public AlgorithmContext(ChessAlgorithm chessAlgorithm) {
        this.chessAlgorithm = chessAlgorithm;
    }

    public int calculateLevel() {
        return chessAlgorithm.calculateNext();
    }
}
