import java.util.*;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = createDeck();
    }

    private static ArrayList<Card> createDeck(){
        ArrayList<Card> newDeck = new ArrayList<Card>();
        // String[] suits = {"Diamond", "Heart", "Spade", "Club"};
        String[] suits = {"♦", "♥", "♠", "♣"};
        for (String suit: suits){
            for (int i = 1; i < 14; i++){
                Card c = new Card(suit, i);
                newDeck.add(c);
            }

        }
        return newDeck;
    }

    public ArrayList<Card> getDeck(){
        System.out.println(deck);
        return deck;
    }

    public void shuffle(){
        Collections.shuffle(deck);
        System.out.println(deck);
    }

    public Card draw(){
        // save card @ beginning
        Card c = deck.get(0);
        // remove from deck
        deck.remove(0);
        // return card
        System.out.println(deck.size());
        return c;

    }
}
