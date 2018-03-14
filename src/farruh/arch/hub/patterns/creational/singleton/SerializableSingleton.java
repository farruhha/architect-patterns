package farruh.arch.hub.patterns.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{
    private static final long serialVersionUID = -7604766932017737115L;

    private static class InstanceClass{
        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance(){
        return InstanceClass.INSTANCE;
    }
}
