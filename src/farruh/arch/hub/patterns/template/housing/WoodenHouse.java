package farruh.arch.hub.patterns.template.housing;

public class WoodenHouse extends HouseTemplate{
    @Override
    void buildPillars() {
        System.out.println("Wooden house");
    }

    @Override
    void buildWalls() {
        System.out.println("Walls for wooden");
    }

    @Override
    void buildWindows() {
        System.out.println("Windows for waoden");
    }
}
