package farruh.arch.hub.patterns.decorator.dosa;

public class MalasaDosaDecorator extends DosaDecorator {

    public MalasaDosaDecorator(Dosa dosa) {
        super(dosa);
    }

    @Override
    public String makeDosa() {
        return dosa.makeDosa() + addMalasa();
    }

    public String addMalasa(){
        return "Malasa added";
    }
}
