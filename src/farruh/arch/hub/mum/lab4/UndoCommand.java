package farruh.arch.hub.mum.lab4;

public class UndoCommand implements Command {

    private OperationReceiver operationReceiver;

    public UndoCommand(OperationReceiver operationReceiver) {
        this.operationReceiver = operationReceiver;
    }

    @Override
    public void execute() {
        operationReceiver.undo();
    }
}
