package farruh.arch.hub.patterns.creational.singleton;

public class EagerInitialization {

    private final static EagerInitialization eagerInitialization = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }
}
