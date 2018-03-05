package farruh.arch.hub.mum.iteratorexercise;

import farruh.arch.hub.mum.iteratorEx.Pred;

import java.util.Iterator;
import java.util.function.Predicate;

public interface MyCustomIterable<E> {
    Iterator<E> selectiveIterator(Predicate<E> predicate);

    Iterable<E> selectiveInternalIterator(Predicate<E> predicate);
}
