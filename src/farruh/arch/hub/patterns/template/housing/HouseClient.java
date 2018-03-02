package farruh.arch.hub.patterns.template.housing;

public class HouseClient {
    public static void main(String[] args) {
        HouseTemplate house = new WoodenHouse();
        house.buildHouse();


        house = new GlassHouse();
        house.buildHouse();

    }
}
