package farruh.arch.hub.patterns.proxy.protect;

public class FolderProxy implements IFolder {

    private Folder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void performReadOrWriteOperation() {

        if (user.getDesignation().equals("CEO")) {
            folder = new Folder();
            System.out.println("Folder Proxy can make call");
            folder.performReadOrWriteOperation();
        } else {
            System.out.println("You can't make call to this folder");
        }
    }
}
