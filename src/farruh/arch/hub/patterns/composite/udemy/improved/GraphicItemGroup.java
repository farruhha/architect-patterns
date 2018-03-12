package farruh.arch.hub.patterns.composite.udemy.improved;

import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup implements Graphic {

    List<Graphic> arrayList;

    public GraphicItemGroup() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void draw() {
        for (Graphic gr : arrayList) {
            gr.draw();
        }
    }
}
