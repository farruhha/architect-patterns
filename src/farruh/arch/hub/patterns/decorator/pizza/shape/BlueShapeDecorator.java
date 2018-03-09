package farruh.arch.hub.patterns.decorator.pizza.shape;

public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setColor(shape);
    }

    private void setColor(Shape shape){
        System.out.println("Color has been applied " + shape);
    }
}
