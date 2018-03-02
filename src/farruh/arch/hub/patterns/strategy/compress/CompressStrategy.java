package farruh.arch.hub.patterns.strategy.compress;

import java.io.File;
import java.util.ArrayList;

public interface CompressStrategy {

    void compressFiles(ArrayList<File> files, String compressFileName);
}
