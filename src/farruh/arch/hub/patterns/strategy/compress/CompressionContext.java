package farruh.arch.hub.patterns.strategy.compress;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {

    private CompressStrategy compressStrategy;

    public void setCompressStrategy(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public void createArchive(ArrayList<File> files, String filename) {
        compressStrategy.compressFiles(files, filename);
    }
}
