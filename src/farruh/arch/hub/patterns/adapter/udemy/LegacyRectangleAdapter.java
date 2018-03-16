package farruh.arch.hub.patterns.adapter.udemy;

public class LegacyRectangleAdapter extends Rectangle {
    private LegacyRectangle rectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle){
        this.rectangle = legacyRectangle;
    }

    @Override
    public Integer determizeSize() {
        return rectangle.calculateSize();
    }
}
