package farruh.arch.hub.mum.lab6.generics;

public class ProxyDemo {
    public static void main(String[] args) {

        Thing<Integer> A = new AThing<>("A thing");
        A.compute(1);

        A = new LoggingProx<>(A, msg -> System.out.println(msg));
        A.compute(1);


    }
}
