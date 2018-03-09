package farruh.arch.hub.patterns.decorator.dosa;

public class Client {

    public static void main(String[] args) {
        PlainDosa plainDosa = new PlainDosa();
        System.out.println(plainDosa.makeDosa());

        MalasaDosaDecorator malasaDosaDecorator = new MalasaDosaDecorator(plainDosa);
        System.out.println(malasaDosaDecorator.makeDosa());
    }
}
