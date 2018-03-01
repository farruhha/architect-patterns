package farruh.arch.hub.patterns.observer.exp1;

import java.util.List;

public class Person implements Observer {

    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void update(Object object) {
        if (object instanceof PostOffice){
            PostOffice po = (PostOffice) object;
            checkMail(po.getState());
        }
    }

    private void checkMail(List<Mail> list){
        //if it is mine, print it here
    }
}
