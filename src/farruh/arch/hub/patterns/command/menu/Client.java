package farruh.arch.hub.patterns.command.menu;

public class Client {
    public static void main(String[] args) {
        WordDocument wordDocument = new WordDocument();
        Command open = new OpenCommand(wordDocument);
        Command close = new CloseCommand(wordDocument);
        Command  save = new SaveCommand(wordDocument);

        MenuOptions menuOptions = new MenuOptions(close,save,open);
        menuOptions.clickClose();
        menuOptions.clickOpen();
        menuOptions.clickSave();
    }
}
