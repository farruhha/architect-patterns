package farruh.arch.hub.patterns.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();

        EagerInitialization eagerInitialization1 = null;

        try {

            Constructor constructors[] = EagerInitialization.class.getConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                eagerInitialization1 = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(eagerInitialization.hashCode());
        System.out.println(eagerInitialization1.hashCode());
    }
}
