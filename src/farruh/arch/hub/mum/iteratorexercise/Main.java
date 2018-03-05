package farruh.arch.hub.mum.iteratorexercise;


import java.util.Iterator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Sample example
        MyVector<Integer> integerMyVector = new MyVector<>();
        integerMyVector.add(1);
        integerMyVector.add(2);
        integerMyVector.add(3);
        integerMyVector.add(4);

        //Sample test for summation for internal and complete

        MySumFunctor functor = new MySumFunctor();
        integerMyVector.doAll(functor);
        System.out.println("Value for summation for internal and complete");
        System.out.println(functor.getValue());

        //Sample test for average summation for internal and complete

        MyAverageFunctor myAverageFunctor = new MyAverageFunctor();
        integerMyVector.doAll(myAverageFunctor);
        System.out.println("Value for average for internal and complete");
        System.out.println(myAverageFunctor.getValue());

        //Sample test for selective external iterator

        Predicate<Integer> predicate = integer -> integer > 0;
        Iterator<Integer> integerIterator = integerMyVector.selectiveIterator(predicate);
        MySumFunctor sumFunctor = new MySumFunctor();
        while (integerIterator.hasNext()) {
            sumFunctor.compute(integerIterator.next());
        }
        System.out.println("Value for external selection");
        System.out.println(sumFunctor.getValue());

        MyAverageFunctor myAverageFunctor1 = new MyAverageFunctor();
        integerMyVector.doAll(myAverageFunctor1, predicate);
        System.out.println("Average internal iterator : ");
        System.out.println(myAverageFunctor1.getValue());

        System.out.println("Selective Iterator");
        for (Integer in : integerMyVector.selectiveInternalIterator(predicate)) {
            System.out.println("Items: " + in);
        }
    }
}
