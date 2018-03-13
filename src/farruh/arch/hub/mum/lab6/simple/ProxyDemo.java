package farruh.arch.hub.mum.lab6.simple;

public class ProxyDemo {
    public static void main(String[] args) {

        Thing A = new AThing("A thing");
        A.compute("Hello");

        A = new LoggingProx(A);
        A.compute("Hello");


    }
}
