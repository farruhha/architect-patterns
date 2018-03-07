package farruh.arch.hub.patterns.command.filesystem;

public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}