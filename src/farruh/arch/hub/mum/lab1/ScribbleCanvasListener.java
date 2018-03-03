package farruh.arch.hub.mum.lab1;

import java.awt.*;
import java.awt.event.*;

public class ScribbleCanvasListener
        implements MouseListener, MouseMotionListener {


    protected Lab1 drawframe;
    protected ScribbleCanvas canvas;
    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;

    protected Tool tool;

    public ScribbleCanvasListener(ScribbleCanvas canvas, Tool tool) {
        this.canvas = canvas;
       // this.drawframe = drawframe;
        this.tool = tool;
    }

    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();

        tool.mousePressed(e);

        switch (drawframe.getCurrentTool()) {
            case 0: // handle mouse pressed for scribble tool
//                canvas.mouseButtonDown = true;
//                canvas.x = p.x;
//                canvas.y = p.y;
                break;
            case 1:  // handle mouse pressed for line tool
                canvas.mouseButtonDown = true;
                xStart = canvas.x = p.x;
                yStart = canvas.y = p.y;
                onscreen = canvas.getGraphics();
                onscreen.setXORMode(Color.darkGray);
                onscreen.setColor(Color.lightGray);
                onscreen.drawLine(xStart, yStart, xStart, yStart);
                break;
            case 2:// handle mouse pressed for rectangle tool
                canvas.mouseButtonDown = true;
                xStart = canvas.x = p.x;
                yStart = canvas.y = p.y;
                onscreen = canvas.getGraphics();
                onscreen.setXORMode(Color.darkGray);
                onscreen.setColor(Color.lightGray);
                onscreen.drawRect(xStart, yStart, 1, 1);
                break;
            case 3:// handle mouse pressed for oval tool
                canvas.mouseButtonDown = true;
                xStart = canvas.x = p.x;
                yStart = canvas.y = p.y;
                onscreen = canvas.getGraphics();
                onscreen.setXORMode(Color.darkGray);
                onscreen.setColor(Color.lightGray);
                onscreen.drawOval(xStart, yStart, 1, 1);
                break;
            case 4:// handle mouse pressed for eraser tool
//                canvas.mouseButtonDown = true;
//                canvas.x = p.x;
//                canvas.y = p.y;
//                offscreen = canvas.getOffScreenGraphics();
//                offscreen.setColor(Color.white);
                break;
        }
    }

    public void mouseReleased(MouseEvent e) {
        Point p = e.getPoint();

        tool.mouseReleased(e);

        switch (drawframe.getCurrentTool()) {
            case 0: // handle mouse released for scribble tool
               // canvas.mouseButtonDown = false;
                break;
            case 1:// handle mouse released for line tool
                canvas.mouseButtonDown = false;
                onscreen.setPaintMode();
                offscreen = canvas.getOffScreenGraphics();
                offscreen.drawLine(xStart, yStart, p.x, p.y);
                canvas.repaint();
                break;
            case 2:// handle mouse released for rectangle tool
                canvas.mouseButtonDown = false;
                onscreen.setPaintMode();
                offscreen = canvas.getOffScreenGraphics();
                offscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
                canvas.repaint();
                break;
            case 3:// handle mouse released for oval tool
                canvas.mouseButtonDown = false;
                onscreen.setPaintMode();
                offscreen = canvas.getOffScreenGraphics();
                offscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
                canvas.repaint();
                break;
            case 4:// handle mouse released for eraser tool
//                canvas.mouseButtonDown = false;
//                canvas.setPenColor(canvas.penColor);
                break;
        }
    }

    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();

        tool.mouseDragged(e);

        switch (drawframe.getCurrentTool()) {
            case 0: // handle mouse dragged for scribble tool
//                if (canvas.mouseButtonDown) {
////                    canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
////                    int xs = Math.min(canvas.x, p.x);
////                    int ys = Math.min(canvas.y, p.y);
////                    int dx = Math.abs(p.x - canvas.x) + 1;
////                    int dy = Math.abs(p.y - canvas.y) + 1;
////                    canvas.repaint(xs, ys, dx, dy);
////                    canvas.x = p.x;
////                    canvas.y = p.y;
//                }
                break;
            case 1:// handle mouse dragged for line tool
                if (canvas.mouseButtonDown) {
                    onscreen.drawLine(xStart, yStart, canvas.x, canvas.y);
                    onscreen.drawLine(xStart, yStart, p.x, p.y);
                }
                canvas.x = p.x;
                canvas.y = p.y;
                break;
            case 2:// handle mouse dragged for rectangle tool
                if (canvas.mouseButtonDown) {
                    onscreen.drawRect(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);
                    onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
                }
                canvas.x = p.x;
                canvas.y = p.y;
                break;
            case 3:// handle mouse dragged for oval tool
                if (canvas.mouseButtonDown) {
                    onscreen.drawOval(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);
                    onscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
                }
                canvas.x = p.x;
                canvas.y = p.y;
                break;
            case 4:// handle mouse dragged for eraser tool
//                if (canvas.mouseButtonDown) {
//                    int xs, ys, dx, dy;
//                    xs = Math.min(canvas.x, p.x) - 2;
//                    ys = Math.min(canvas.y, p.y) - 2;
//                    dx = Math.abs(p.x - canvas.x) + 6;
//                    dy = Math.abs(p.y - canvas.y) + 6;
//                    offscreen.fillRect(xs, ys, dx, dy);
//                    canvas.repaint(xs, ys, dx, dy);
//                    canvas.x = p.x;
//                    canvas.y = p.y;
//                }

        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }


}

