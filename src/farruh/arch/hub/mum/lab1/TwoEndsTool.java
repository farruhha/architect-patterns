package farruh.arch.hub.mum.lab1;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TwoEndsTool implements Tool {

    private TwoEndsShape twoEndsShape;
    private ScribbleCanvas canvas;
    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;

    public TwoEndsTool(TwoEndsShape endsShape, ScribbleCanvas canvas){
        this.canvas = canvas;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
        canvas.mouseButtonDown = true;
        xStart = canvas.x = p.x;
        yStart = canvas.y = p.y;
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);
        twoEndsShape.drawShape();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }
}
