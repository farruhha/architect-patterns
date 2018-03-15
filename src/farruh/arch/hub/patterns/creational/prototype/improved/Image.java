package farruh.arch.hub.patterns.creational.prototype.improved;

public class Image extends Graphic {

    String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        Image image = new Image();
        image.setUrl(this.url);
        return image;
    }

    @Override
    public String getUrl() {
        return this.url;
    }
}
