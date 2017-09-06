public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public String getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        if (value == 1){
            return suit + ":Ace";
        }
        else if (value == 11){
            return suit + ":Jack";
        }
        else if (value == 12){
            return suit + ":Queen";
        }
        else if (value == 13){
            return suit + ":King";
        }
        else {
            return suit + ":" + value;
        }
    }
}
