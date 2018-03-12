package farruh.arch.hub.patterns.strategy.udemy.improved;

import farruh.arch.hub.patterns.facade.Algorithm;
import farruh.arch.hub.patterns.strategy.udemy.Difficulty;

public class Chess {

    AlgorithmContext algorithmContext;

    public Chess(AlgorithmContext algorithmContext) {
        this.algorithmContext = algorithmContext;
    }

    public int calculateNextStep() {
        return algorithmContext.calculateLevel();
    }


}
