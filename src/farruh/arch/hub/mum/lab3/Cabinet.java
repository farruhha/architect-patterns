package farruh.arch.hub.mum.lab3;

import java.util.*;

public class Cabinet {
    private Board board;
    private Vector<Component> drivelist = new Vector<>();

    public void setBoard(Board b) {
        board = b;
    }

    public void addDrive(Component d) {
        drivelist.addElement(d);
    }

    public double netPrice() {
        return 6.00;
    }

    public double discountPrice() {
        return 3.00;
    }

    public double computePrice() {
        double tmp = netPrice();
        if (board != null)
            tmp += board.computePrice();
        for (Component drive : drivelist)
            tmp += drive.computePrice();
        return tmp;
    }
}
