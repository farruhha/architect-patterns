package farruh.arch.hub.patterns.strategy.compress;

import java.io.File;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<File> arrayList = new ArrayList<>();
        arrayList.add(new File("df"));

        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressStrategy(new ZipCompressStrategy());
        compressionContext.createArchive(arrayList, "HelloWorld");

        CompressionContext compressionContext1 = new CompressionContext();
        compressionContext1.setCompressStrategy(new RarCompressStrategy());
        compressionContext1.createArchive(arrayList,"Hello");
    }

}
