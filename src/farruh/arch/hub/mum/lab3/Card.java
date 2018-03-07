package farruh.arch.hub.mum.lab3;

public class Card implements Component {
    public double netPrice() {
        return 10.00;
    }

    public double discountPrice() {
        return 1.00;
    }

    public double computePrice() {
        return netPrice();
    }
}

