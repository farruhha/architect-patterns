package farruh.arch.hub.mum.lab6.functor;

public class ProxyDemo {
    public static void main(String[] args) {

        Thing A = new AThing("A thing");
        A.compute("Hello");

        A = new LoggingProx(A, msg -> System.out.println(msg));
        A.compute("Hello");


    }
}
