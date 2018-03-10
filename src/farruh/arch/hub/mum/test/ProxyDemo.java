package farruh.arch.hub.mum.test;

public class ProxyDemo {
    public static void main(String[] args) {

        Thing A = new AThing("A thing");
        A.compute("Hello");

        LoggingProx loggingProx = new LoggingProx(A);
        loggingProx.compute("Hello");


        Thing B = new BThing("B thing");
        B.compute("Hello");

        LoggingProx logginProx2 = new LoggingProx(B);
        logginProx2.compute("Hello");

    }
}
