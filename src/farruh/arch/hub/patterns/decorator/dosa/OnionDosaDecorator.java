package farruh.arch.hub.patterns.decorator.dosa;

public class OnionDosaDecorator extends DosaDecorator {

    public OnionDosaDecorator(Dosa dosa) {
        super(dosa);
    }

    @Override
    public String makeDosa() {
        return dosa.makeDosa() + addOnion();
    }

    public String addOnion() {
        return "Onion added";
    }
}
