package farruh.arch.hub.patterns.creational.prototype.improved;

public class GraphicTool {

    private Graphic protype;

    public GraphicTool(Graphic protype) {
        this.protype = protype;
    }

    public void setProtype(Graphic protype) {
        this.protype = protype;
    }

    protected Graphic graphic() {
        return protype.clone();
    }
}
