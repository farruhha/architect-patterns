package farruh.arch.hub.patterns.proxy.remoteproxy;

public class RealFile implements File {

    private String filename = null;

    public RealFile(String FILENAME) {
        filename = FILENAME;
        loadFromTheDisk();
    }

    private void loadFromTheDisk() {
        System.out.println("Loading from the disk");
    }

    @Override
    public void fetchFile() {
        System.out.println("Fetching the data from the disk");
    }
}
