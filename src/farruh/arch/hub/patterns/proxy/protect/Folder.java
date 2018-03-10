package farruh.arch.hub.patterns.proxy.protect;

public class Folder implements IFolder{
    @Override
    public void performReadOrWriteOperation() {
        System.out.println(this.getClass() +" performing read or write operation on the folder");
    }
}
