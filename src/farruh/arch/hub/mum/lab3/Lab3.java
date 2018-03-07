package farruh.arch.hub.mum.lab3;

public class Lab3 {
    static public void main(String args[]) {
        Cabinet cab = new Cabinet();
        Board board = new Board();

        Drive d1 = new Drive();
        Drive d2 = new Drive();
        Drive d3 = new Drive();
        Bus bus = new Bus();

        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();

        cab.setBoard(board);
        cab.addDrive(d1);
        cab.addDrive(d2);
        cab.addDrive(d3);

        board.setBus(bus);
        board.addCard(card1);
        board.addCard(card2);
        board.addCard(card3);

        System.out.println("Total price of computer is: " + cab.computePrice());
    }
}
