package farruh.arch.hub.patterns.creational.prototype.improved;

public class Client {
    public static void main(String[] args) {
        Image image = new Image();
        image.setUrl("https://hello.com");

        GraphicTool graphicTool = new GraphicTool(image);
        Graphic imageCloned = graphicTool.graphic();

        System.out.println("Graphic instantiated" + imageCloned.getClass());

        Video video = new Video();
        video.setUrl("https://video.com");

        graphicTool.setProtype(video);

        Graphic videoCloned = graphicTool.graphic();
        System.out.println("Graphic instantiated : " + videoCloned.getClass());
    }
}
