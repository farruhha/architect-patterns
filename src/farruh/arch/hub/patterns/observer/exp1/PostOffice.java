package farruh.arch.hub.patterns.observer.exp1;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {

    ArrayList<Mail> arrayList;
    ArrayList<Observer> observers;

    public PostOffice(ArrayList<Mail> arrayList, ArrayList<Observer> observers) {
        this.arrayList = arrayList;
        this.observers = observers;
    }

    public void addMail(Mail mail) {
        arrayList.add(mail);
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }

    public List<Mail> getState() {
        return arrayList;
    }
}
