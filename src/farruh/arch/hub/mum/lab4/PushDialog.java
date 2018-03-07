package farruh.arch.hub.mum.lab4;

import javax.swing.*;
import java.awt.*;

public class PushDialog extends JDialog {
    OperationReceiver parentframe;

    public PushDialog(OperationReceiver parent) {
        parentframe = parent; // remember the parent frame

        setTitle("StringDialog.");
        setModal(true);
        getContentPane().setLayout(null);
        setSize(349, 146);
        setVisible(false);

        getContentPane().add(JTextField);
        JTextField.setBounds(144, 24, 140, 24);
        JLabel1.setText("Text to push:");

        getContentPane().add(JLabel1);
        JLabel1.setBounds(24, 24, 106, 23);
        JButtonCancel.setText("Cancel");

        JButtonCancel.setActionCommand("Cancel");
        getContentPane().add(JButtonCancel);
        JButtonCancel.setBounds(60, 84, 105, 28);

        JButtonOK.setText("OK");
        JButtonOK.setActionCommand("OK");
        getContentPane().add(JButtonOK);
        JButtonOK.setBounds(180, 84, 106, 26);

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();
        JButtonCancel.addActionListener(lSymAction);
        JButtonOK.addActionListener(lSymAction);
    }


    class SymWindow extends java.awt.event.WindowAdapter {
        public void windowClosing(java.awt.event.WindowEvent event) {
            Object object = event.getSource();
            if (object == PushDialog.this)
                PushDialog_WindowClosing(event);
        }
    }

    void PushDialog_WindowClosing(java.awt.event.WindowEvent event) {
        dispose();
    }

    //
    javax.swing.JTextField JTextField = new JTextField();
    JLabel JLabel1 = new JLabel();
    JButton JButtonCancel = new JButton();
    JButton JButtonOK = new JButton();
    //


    class SymAction implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent event) {
            Object object = event.getSource();
            if (object == JButtonCancel)
                JButtonCancel_actionPerformed(event);
            else if (object == JButtonOK)
                JButtonOK_actionPerformed(event);
        }
    }

    void JButtonCancel_actionPerformed(java.awt.event.ActionEvent event) {
        dispose(); //close the dialog

    }

    void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
        parentframe.setString(JTextField.getText()); //make Lab4.pushstring equal to user input
        dispose();    //close the dialog
    }

}