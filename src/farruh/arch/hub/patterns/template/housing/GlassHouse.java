package farruh.arch.hub.patterns.template.housing;

public class GlassHouse extends HouseTemplate {
    @Override
    void buildPillars() {
        System.out.println("With glasses");
    }

    @Override
    void buildWalls() {
        System.out.println("With glass walls");
    }

    @Override
    void buildWindows() {
        System.out.println("With glass windows");
    }
}
