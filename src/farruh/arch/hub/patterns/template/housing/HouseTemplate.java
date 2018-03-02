package farruh.arch.hub.patterns.template.housing;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("Building the house");
    }

    void buildFoundation() {
        System.out.println("Building foundation");
    }

    abstract void buildPillars();

    abstract void buildWalls();

    abstract void buildWindows();
}
