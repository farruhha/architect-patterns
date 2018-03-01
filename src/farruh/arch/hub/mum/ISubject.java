package farruh.arch.hub.mum;

public interface ISubject {

   void attach(Observer observer);

   void detach(Observer observer);

   void notifyObserver();

}
