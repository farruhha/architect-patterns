package farruh.arch.hub.mum.lab4;

import javax.swing.*;

public class OperationReceiverImpl implements OperationReceiver {

    private Lab4 lab4;
    private String pushString;

    public OperationReceiverImpl(Lab4 lab4) {
        this.lab4 = lab4;
    }

    @Override
    public void push() {
        pushString = "";
        PushDialog dialog = new PushDialog(this); //ask the user what to push
        dialog.setVisible(true);
        if (!pushString.equals("")) // after the dialog is closed,
            lab4.stack.push(pushString);  // pushstring contains the user input
        lab4.JList1.setListData(lab4.stack.getStackVector());  // refresh the JList
        lab4.repaint();
    }

    @Override
    public void pop() {
        lab4.stack.pop();
        lab4.JList1.setListData(lab4.stack.getStackVector()); // refresh the JList
        lab4.repaint();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

    @Override
    public void setString(String s) {
        pushString = s;
    }

}
