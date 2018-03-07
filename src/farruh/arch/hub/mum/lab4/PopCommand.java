package farruh.arch.hub.mum.lab4;

import javax.swing.*;

public class PopCommand  implements Command{

    private OperationReceiver operationReceiver;

    public PopCommand(OperationReceiver operationReceiver){
        this.operationReceiver = operationReceiver;
    }
    @Override
    public void execute() {
        operationReceiver.pop();
    }
}
