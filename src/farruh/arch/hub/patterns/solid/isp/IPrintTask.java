package farruh.arch.hub.patterns.solid.isp;

public interface IPrintTask {
    boolean printContent(String content);

    boolean scanContext(String context);

    boolean faxContent(String context);

    boolean photoCopy(String context);
}
