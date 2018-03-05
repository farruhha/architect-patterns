package farruh.arch.hub.mum.iteratorexercise;

import java.util.Iterator;
import java.util.function.Predicate;

public interface MyCustomIterable<E> {
    Iterator<E> selectiveIterator(Predicate<E> predicate);

    Iterable<E> selectiveInternalIterator(Predicate<E> predicate);
}
