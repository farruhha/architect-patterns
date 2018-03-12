package farruh.arch.hub.patterns.proxy.udemy.improved;

public class Image {

    protected String url;

    public Image(){

    }

    public Image(String url) {
        this.url = url;
    }

    public void draw() {
        System.out.println("Drawing image + from this url" + url);
    }
}
