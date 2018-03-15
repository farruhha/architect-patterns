package farruh.arch.hub.patterns.creational.prototype.improved;

public class Video extends Graphic {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        Video video = new Video();
        video.setUrl(url);
        return video;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
