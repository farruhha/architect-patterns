package farruh.arch.hub.patterns.strategy.udemy;

public class Chess {

    private Difficulty difficulty = Difficulty.EASY;

    public int calculateNextStep() {
        if (difficulty == difficulty.EASY) {
            return 1;
        } else if (difficulty == difficulty.MEDIUM) {
            return 2;
        } else if (difficulty == difficulty.HARD) {
            return 3;
        }
        return 0;
    }

    public void setDifficulty(Difficulty difficulty){
        this.difficulty = difficulty;
    }
}
