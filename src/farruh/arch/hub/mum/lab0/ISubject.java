package farruh.arch.hub.mum.lab0;

public interface ISubject {

   void attach(Observer observer);

   void detach(Observer observer);

   void notifyObserver();

}
