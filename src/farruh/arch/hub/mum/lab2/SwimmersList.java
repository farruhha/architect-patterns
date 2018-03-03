package farruh.arch.hub.mum.lab2;

import java.util.*;
import java.util.function.Predicate;

public class SwimmersList<E> implements MyCustomIterable<E>, SwimmersListInterface<E> {
    private Vector<E> slist = new Vector<>();


    public Vector getVector() {
        return slist;
    }


    @Override
    public void addSwimmer(E swimmer) {
        slist.addElement(swimmer);
    }

    @Override
    public Iterator<E> iterator(Predicate<E> predicate) {
        return new MyCustomImplIterator(slist, predicate);
    }

    @Override
    public Iterator<E> reverseIterator() {
        return new ReserveIterator(slist);
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomSimpleIterator(slist);
    }


    private class ReserveIterator implements Iterator<E> {
        private Vector<E> item;
        private int position;

        public ReserveIterator(Vector<E> item) {
            this.item = item;
            position = item.size() - 1;
        }

        @Override
        public boolean hasNext() {
            if (position > -1) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E w = item.get(position);
            position--;
            return w;
        }
    }

    private class MyCustomImplIterator implements Iterator<E> {

        private Vector<E> item;
        private Predicate<E> predicate;
        private int position;

        public MyCustomImplIterator(Vector<E> item, Predicate<E> predicate) {
            this.item = item;
            this.predicate = predicate;
        }

        @Override
        public boolean hasNext() {
            if (position < item.size()) {
                E e = item.get(position);
                if (predicate.test(e)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }


        @Override
        public E next() {
            E e = item.get(position);
            position++;
            return e;
        }
    }

    private class CustomSimpleIterator implements Iterator<E> {

        private Vector<E> item;
        private int position;

        public CustomSimpleIterator(Vector<E> item) {
            this.item = item;
        }

        @Override
        public boolean hasNext() {
            if (position < item.size()) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E e = item.get(position);
            position++;
            return e;
        }
    }
}
