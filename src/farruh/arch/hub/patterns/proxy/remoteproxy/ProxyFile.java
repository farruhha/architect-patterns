package farruh.arch.hub.patterns.proxy.remoteproxy;

import java.util.function.Predicate;

public class ProxyFile implements File {

    private RealFile file = null;
    private String filename = null;

    public ProxyFile(final String filename) {
        this.filename = filename;
    }


    @Override
    public void fetchFile() {
        if (file == null) {
            file = new RealFile(filename);
        }
        file.fetchFile();
    }
}
