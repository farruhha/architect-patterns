package farruh.arch.hub.patterns.composite.udemy;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup {

    private List<Line> lines = new ArrayList<>();
    private List<Rectangle> rectangles = new ArrayList<>();

    public void draw() {
        for (Line line : lines) {
            line.draw();
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}
