package farruh.arch.hub.patterns.proxy.protect;

public class Client {
    public static void main(String[] args) {
        User user = new User("Farruh","13","CEO");
        IFolder folder = new FolderProxy(user);
        folder.performReadOrWriteOperation();
    }
}
