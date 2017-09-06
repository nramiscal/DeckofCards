public class Test{
    public static void main(String[] args) {

        Card card = new Card("Spades", 1);
        System.out.println(card.toString());

        Deck deck = new Deck();
        // deck.getDeck();
        deck.shuffle();
        Card draw1 = deck.draw();
        System.out.println(draw1.toString());
        Card draw2 = deck.draw();
        System.out.println(draw2.toString());
    }
}
