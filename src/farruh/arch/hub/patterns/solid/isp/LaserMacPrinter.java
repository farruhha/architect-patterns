package farruh.arch.hub.patterns.solid.isp;

public class LaserMacPrinter  implements IPrintTask{
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContext(String context) {
        return false;
    }

    @Override
    public boolean faxContent(String context) {
        return false;
    }

    @Override
    public boolean photoCopy(String context) {
        return false;
    }
}
