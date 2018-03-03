package farruh.arch.hub.mum.lab2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.function.Predicate;

/**
 * A basic JFC 1.1 based application.
 */
public class Lab2 extends JFrame {
    private SwimmersList<Swimmer> slist;

    public Lab2() {
        setTitle("Iterator Lab.");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(660, 310);
        setVisible(false);

        JButtonAllSwimmers.setText("All Swimmers");
        JButtonAllSwimmers.setActionCommand("All Swimmers");
        getContentPane().add(JButtonAllSwimmers);
        JButtonAllSwimmers.setBounds(14, 26, 190, 24);

        JButtonAllBackward.setText("All Swimmers Backward");
        JButtonAllBackward.setActionCommand("All Swimmers Backward");
        getContentPane().add(JButtonAllBackward);
        JButtonAllBackward.setBounds(210, 24, 180, 26);

        JButtonAllAbove12.setText("All Swimmers Above 12");
        JButtonAllAbove12.setActionCommand("All Swimmers above 12");
        getContentPane().add(JButtonAllAbove12);
        JButtonAllAbove12.setBounds(408, 24, 180, 24);

        JScrollPane1.setOpaque(true);
        getContentPane().add(JScrollPane1);

        JScrollPane1.setBounds(12, 60, 190, 109);
        JScrollPane1.getViewport().add(JTextArea1);
        JTextArea1.setBounds(0, 0, 188, 206);

        getContentPane().add(JScrollPane2);
        JScrollPane2.setBounds(216, 60, 182, 204);
        JScrollPane2.getViewport().add(JTextArea2);
        JTextArea2.setBounds(0, 0, 180, 200);

        getContentPane().add(JScrollPane3);
        JScrollPane3.setBounds(408, 60, 177, 204);
        JScrollPane3.getViewport().add(JTextArea3);
        JTextArea3.setBounds(0, 0, 176, 200);
        FillData();
        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();
        JButtonAllSwimmers.addActionListener(lSymAction);
        JButtonAllBackward.addActionListener(lSymAction);
        JButtonAllAbove12.addActionListener(lSymAction);
    }

    static public void main(String args[]) {
        try {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }
            //Create a new instance of our application's frame, and make it visible.
            Lab2 lab2 = new Lab2();
            lab2.setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }


    JButton JButtonAllSwimmers = new JButton();
    JButton JButtonAllBackward = new JButton();
    JButton JButtonAllAbove12 = new JButton();
    JScrollPane JScrollPane1 = new JScrollPane();
    JTextArea JTextArea1 = new JTextArea();
    JScrollPane JScrollPane2 = new JScrollPane();
    JTextArea JTextArea2 = new JTextArea();
    JScrollPane JScrollPane3 = new JScrollPane();
    JTextArea JTextArea3 = new JTextArea();


    public void FillData() {
        slist = new SwimmersList();

        Swimmer pswim = new Swimmer("Amanda", "McCarthy", "WCA", 12, 28.10);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Jamie", "Falco", "HNHS", 12, 29.80);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Meaghan", "O'Donnell", "EDST", 12, 30.00);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Greer", "Gibbs", "CDEV", 11, 30.04);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Rhiannon", "Jeffrey", "WYW", 12, 30.04);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Sophie", "Connolly", "HNHS", 11, 30.11);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Dana", "Helyer", "EDST", 12, 30.20);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Lindsay", "Marotto", "CDEV", 11, 30.22);
        slist.addSwimmer(pswim);
        pswim = new Swimmer("Sarah", "Treichel", "WCA", 12, 30.34);
        slist.addSwimmer(pswim);

    }

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
            if (object == Lab2.this)
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
            if (object == JButtonAllSwimmers)
                JButtonAllSwimmers_actionPerformed(event);
            else if (object == JButtonAllBackward)
                JButtonAllBackward_actionPerformed(event);
            else if (object == JButtonAllAbove12)
                JButtonAllAbove12_actionPerformed(event);

        }
    }

    void JButtonAllSwimmers_actionPerformed(ActionEvent event) {

        Iterator<Swimmer> swimmerIterator = slist.iterator();
        while (swimmerIterator.hasNext()) {
            Swimmer swimmer = swimmerIterator.next();
            JTextArea1.append(swimmer.getFname() + " " + swimmer.getLname() + " \n");
        }

    }

    void JButtonAllBackward_actionPerformed(ActionEvent event) {

        SwimmerIterator<Swimmer> swimmerIterator = slist.reverseIterator();
        while (swimmerIterator.hasNext()) {
            Swimmer swimmer = swimmerIterator.next();
            JTextArea1.append(swimmer.getFname() + " " + swimmer.getLname() + " \n");
        }

//        Vector vectorlist = slist.getVector();
//        for (int x = vectorlist.size() - 1; x > -1; x--) {
//            Swimmer swimmer = (Swimmer) vectorlist.elementAt(x);
//            JTextArea2.append(swimmer.getFname() + " " + swimmer.getLname() + " \n");
//        }

    }

    void JButtonAllAbove12_actionPerformed(ActionEvent event) {
        Predicate<Swimmer> predicate = swimmer -> swimmer.getAge() > 12;

        SwimmerIterator<Swimmer> swimmerIterator = slist.iterator(predicate);
        while (swimmerIterator.hasNext()) {
            Swimmer swimmer = swimmerIterator.next();
            JTextArea3.append(swimmer.getFname() + " " + swimmer.getLname() + " \n");
        }

//        Vector vectorlist = slist.getVector();
//        for (int x = 0; x < vectorlist.size(); x++) {
//            Swimmer swimmer = (Swimmer) vectorlist.elementAt(x);
//            if (swimmer.getAge() >= 12)
//                JTextArea3.append(swimmer.getFname() + " " + swimmer.getLname() + " \n");
//        }
    }
}
