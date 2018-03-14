package farruh.arch.hub.patterns.creational.singleton;

public class DoubleLocking {

    private static DoubleLocking instance;

    private DoubleLocking() {
    }

    public static DoubleLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleLocking.class) {
                instance = new DoubleLocking();
            }
        }
        return instance;
    }
}
