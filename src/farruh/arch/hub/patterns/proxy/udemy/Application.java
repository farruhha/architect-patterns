package farruh.arch.hub.patterns.proxy.udemy;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Image> imageList = new ArrayList<>();

    public Application(List<Image> images){
        this.imageList = images;
    }

    public void draw(){
        for(Image image:imageList){
            image.draw();
        }
    }
}
