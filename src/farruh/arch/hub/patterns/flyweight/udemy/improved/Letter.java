package farruh.arch.hub.patterns.flyweight.udemy.improved;

public class Letter {

    private String value;

    public Letter(String letter) {
        System.out.println("Value is created for letter " + letter);
        this.value = letter;
    }

    public String getValue() {
        return value;
    }
}
