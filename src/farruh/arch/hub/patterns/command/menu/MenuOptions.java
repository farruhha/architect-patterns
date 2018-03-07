package farruh.arch.hub.patterns.command.menu;

public class MenuOptions {

    private Command close;
    private Command save;
    private Command open;

    public MenuOptions(Command close, Command save, Command open) {
        this.close = close;
        this.save = save;
        this.open = open;
    }


    public void clickOpen() {
        open.execute();
    }

    public void clickSave() {
        save.execute();
    }

    public void clickClose() {
        close.execute();
    }
}
