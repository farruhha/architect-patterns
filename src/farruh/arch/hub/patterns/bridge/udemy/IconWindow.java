package farruh.arch.hub.patterns.bridge.udemy;

public class IconWindow implements Window {
    @Override
    public void draw(int x, int y, int width, int height, String color) {

    }

    public void drawIcon(){
        draw(10,10,10,10,"Red");
        draw(12,1,12,12,"Blue");
    }
}
