package farruh.arch.hub.mum.lab4;

import javax.swing.*;

public interface OperationReceiver {

    void push();

    void pop();

    void undo();

    void redo();

    void setString(String s);

}
