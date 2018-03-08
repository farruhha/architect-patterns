package farruh.arch.hub.mum.lab5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab5 extends JFrame {
    Car mycar = new Car();

    public Lab5() {

        setTitle("State pattern lab.");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(485, 250);
        setVisible(false);

        getContentPane().add(JTextFieldShift);
        JTextFieldShift.setBounds(168, 30, 220, 30);
        getContentPane().add(JTextFieldSpeed);
        JTextFieldSpeed.setBounds(168, 60, 220, 30);

        Shift.setText("Shift");
        getContentPane().add(Shift);
        Shift.setBounds(120, 24, 36, 27);

        JLabel1.setText("Speed");
        getContentPane().add(JLabel1);
        JLabel1.setBounds(120, 60, 48, 32);

        JSlider1.setMinorTickSpacing(1);
        JSlider1.setValue(0);
        JSlider1.setMaximum(70);
        JSlider1.setPaintLabels(true);
        JSlider1.setPaintTicks(true);
        JSlider1.setMajorTickSpacing(10);

        getContentPane().add(JSlider1);
        JSlider1.setBounds(80, 132, 300, 48);

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();
        SymChange lSymChange = new SymChange();
        JSlider1.addChangeListener(lSymChange);

    }

    static public void main(String args[]) {
        try {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }

            //Create a new instance of our application's frame, and make it visible.
            (new Lab5()).setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }

    JTextField JTextFieldShift = new JTextField();
    JTextField JTextFieldSpeed = new JTextField();
    JLabel Shift = new JLabel();
    JLabel JLabel1 = new JLabel();
    JSlider JSlider1 = new JSlider();

    void exitApplication() {
        try {
            this.setVisible(false);    // hide the Frame
            this.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends WindowAdapter {
        public void windowClosing(WindowEvent event) {
            Object object = event.getSource();
            if (object == Lab5.this)
                JFrame1_windowClosing(event);
        }
    }

    void JFrame1_windowClosing(WindowEvent event) {
        // to do: code goes here.

        JFrame1_windowClosing_Interaction1(event);
    }

    void JFrame1_windowClosing_Interaction1(WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

    class SymAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object object = event.getSource();

        }
    }

    class SymChange implements javax.swing.event.ChangeListener {
        public void stateChanged(javax.swing.event.ChangeEvent event) {
            Object object = event.getSource();
            if (object == JSlider1)
                JSlider1_stateChanged(event);
        }
    }

    void JSlider1_stateChanged(javax.swing.event.ChangeEvent event) {
        JSlider source = (JSlider) event.getSource();
        if (!source.getValueIsAdjusting()) {
            int mph = (int) source.getValue();
            int shift = mycar.changeSpeed(mph);
            JTextFieldSpeed.setText(String.valueOf(mph));
            if (shift > 0)
                JTextFieldShift.setText(String.valueOf(shift));
            else
                JTextFieldShift.setText("Park");
        }
    }
}