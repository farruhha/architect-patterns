package farruh.arch.hub.patterns.bridge.udemy;

public class DirectXWindow implements Window {
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("DirectWindow - x : "+x+" y : "+ y+" width: " + width + " height: " +height);
    }
}
