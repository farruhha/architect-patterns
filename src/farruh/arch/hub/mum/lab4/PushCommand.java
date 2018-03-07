package farruh.arch.hub.mum.lab4;

import javax.swing.*;

public class PushCommand implements Command {

    private OperationReceiver operationReceiver;

    public PushCommand(OperationReceiver operationReceiver) {
        this.operationReceiver = operationReceiver;
    }

    @Override
    public void execute() {
        operationReceiver.push();
    }
}
