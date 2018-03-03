package farruh.arch.hub.mum.lab2;

import java.util.Collection;
import java.util.function.Predicate;

public interface MyCustomIterable<E> extends Iterable<E>{

    SwimmerIterator<E> iterator(Predicate<E> predicate);

    SwimmerIterator<E> reverseIterator();


}
