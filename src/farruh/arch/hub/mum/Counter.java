package farruh.arch.hub.mum;

public class Counter {
    private TextFrame textframe;
    private RectFrame rectframe;
    private OvalFrame ovalframe;
    private int count;

    public Counter(TextFrame tf, RectFrame rf, OvalFrame of) {
        textframe = tf;
        rectframe = rf;
        ovalframe = of;
        count = 0;
    }

    public void increment() {
        count++;
        textframe.setCount(count);
        rectframe.setCount(count);
        ovalframe.setCount(count);
    }

    public void decrement() {
        if (count > 0) {
            count--;
            textframe.setCount(count);
            rectframe.setCount(count);
            ovalframe.setCount(count);
        }
    }
}