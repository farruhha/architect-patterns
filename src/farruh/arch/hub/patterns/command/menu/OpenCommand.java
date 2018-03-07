package farruh.arch.hub.patterns.command.menu;

public class OpenCommand  implements Command{

    WordDocument wordDocument;

    public OpenCommand(WordDocument wordDocument){
        this.wordDocument = wordDocument;
    }

    @Override
    public void execute() {
        wordDocument.open();
    }
}
