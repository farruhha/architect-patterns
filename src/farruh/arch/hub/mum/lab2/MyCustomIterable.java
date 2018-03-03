package farruh.arch.hub.mum.lab2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public interface MyCustomIterable<E> extends Iterable<E>{

    Iterator<E> iterator(Predicate<E> predicate);

    Iterator<E> reverseIterator();


}
