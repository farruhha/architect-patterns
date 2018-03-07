package farruh.arch.hub.mum.lab3;

import java.util.*;

public class Board implements Component {
    private Bus bus;
    private Vector<Component> cardlist = new Vector<>();

    public void setBus(Bus b) {
        bus = b;
    }

    public void addCard(Card d) {
        cardlist.addElement(d);
    }

    public double netPrice() {
        return 26.00;
    }

    public double discountPrice() {
        return 6.00;
    }

    public double computePrice() {
        double tmp = discountPrice();
        if (bus != null)
            tmp += bus.computePrice();
        for (Component card : cardlist)
            tmp += card.computePrice();
        return tmp;
    }
}
