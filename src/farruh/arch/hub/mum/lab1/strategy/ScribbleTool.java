package farruh.arch.hub.mum.lab1.strategy;

import farruh.arch.hub.mum.lab1.ScribbleCanvas;

import java.awt.*;
import java.awt.event.MouseEvent;


public class ScribbleTool implements Tool {

    protected ScribbleCanvas canvas;

    public ScribbleTool(ScribbleCanvas scribbleCanvas){
        this.canvas = scribbleCanvas;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }
}
