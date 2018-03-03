package farruh.arch.hub.mum.lab1.strategy;

public class ContextTool {

    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void drawMousePressed() {
        tool.mousePressed();
    }

    public void drawMouseReleased() {
        tool.mouseReleased();
    }

    public void drawMouseDragged() {
        tool.mouseDragged();
    }
}
