package farruh.arch.hub.patterns.adapter.udemy;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter legacyRectangleAdapter = new LegacyRectangleAdapter(legacyRectangle);
        client.calculateRectangleSize(legacyRectangleAdapter);

    }

    public void calculateRectangleSize(Rectangle rectangle){
        System.out.println("Rectangle size " + rectangle.determizeSize());
    }
}
