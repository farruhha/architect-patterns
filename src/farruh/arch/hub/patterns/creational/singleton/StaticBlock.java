package farruh.arch.hub.patterns.creational.singleton;

public class StaticBlock {

    private static StaticBlock instance;

    static {
        try {

            instance = new StaticBlock();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    private StaticBlock() {
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}
