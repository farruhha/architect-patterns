package farruh.arch.hub.mum.lab4;

import javax.swing.*;

public class OperationInvoker {
    private Command command;

    public OperationInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
