package farruh.arch.hub.mum.lab0;

import java.util.ArrayList;
import java.util.List;

public class Counter implements ISubject {
    List<Observer> observers;
    private int count;

    public Counter() {
//        textframe = tf;
//        rectframe = rf;
//        ovalframe = of;
        observers = new ArrayList<>();
        count = 0;
    }

    public void increment() {
        count++;
//        textframe.setCount(count);
//        rectframe.setCount(count);
//        ovalframe.setCount(count);
        notifyObserver();
    }

    public void decrement() {
        if (count > 0) {
            count--;
//            textframe.setCount(count);
//            rectframe.setCount(count);
//            ovalframe.setCount(count);
            notifyObserver();
        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public int getCount() {
        return count;
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }
}