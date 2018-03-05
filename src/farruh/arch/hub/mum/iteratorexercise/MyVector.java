package farruh.arch.hub.mum.iteratorexercise;


import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class MyVector<T> extends Vector<T> implements MyCustomIterable<T> {

    public <R> void doAll(Functor<T, R> functor) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            functor.compute((T) iterator.next());
        }
    }

    public <R> void doAll(Functor<T, R> functor, Predicate<T> predicate) {
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            if (predicate.test(element)) {
                functor.compute(element);
            }
        }
    }

    @Override
    public Iterator<T> selectiveIterator(Predicate<T> predicate) {
        return new SelectiveExternalIterative(this, predicate);
    }

    @Override
    public Iterable<T> selectiveInternalIterator(Predicate<T> predicate) {
        return new View(predicate);
    }


    private class SelectiveExternalIterative implements Iterator<T> {

        private Predicate<T> predicate;
        private Vector<T> vector;
        private int position = 0;

        public SelectiveExternalIterative(Vector<T> vector, Predicate<T> predicate) {
            this.predicate = predicate;
            this.vector = vector;

        }

        @Override
        public boolean hasNext() {
            while (position < vector.size()) {
                if (predicate.test(vector.get(position))) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T elm = vector.elementAt(position);
                position++;
                return elm;
            } else return null;
        }
    }

    private class View implements Iterable<T> {

        private Predicate<T> predicate;

        public View(Predicate<T> predicate) {
            this.predicate = predicate;
        }

        @Override
        public Iterator<T> iterator() {
            return selectiveIterator(predicate);
        }
    }

}
