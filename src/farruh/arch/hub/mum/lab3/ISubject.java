package farruh.arch.hub.mum.lab3;

public interface ISubject {

   void attach(Observer observer);

   void detach(Observer observer);

   void notifyObserver();

}
