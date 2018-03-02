package farruh.arch.hub.patterns.template.coffee;

public abstract class CoffeeTemplate {

    public final void buildCoffee() {
        boilWater();
        addMilk();
        addSugar();
        addCoffeePower();
    }

    public abstract void boilWater();

    public abstract void addMilk();

    public abstract void addSugar();

    public abstract void addCoffeePower();
}
