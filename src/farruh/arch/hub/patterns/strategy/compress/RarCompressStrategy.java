package farruh.arch.hub.patterns.strategy.compress;

import java.io.File;
import java.util.ArrayList;

public class RarCompressStrategy implements CompressStrategy{
    @Override
    public void compressFiles(ArrayList<File> files, String compressFileName) {
        System.out.println("Rar compress "+ compressFileName +" has been created!");
    }
}
