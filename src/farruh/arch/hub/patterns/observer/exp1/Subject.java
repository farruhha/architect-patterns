package farruh.arch.hub.patterns.observer.exp1;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
