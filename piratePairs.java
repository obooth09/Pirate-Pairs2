//import java.util.Arrays;

public class PiratePairs {

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player[] players = new Player[1];
        players[0] = new Player();
       

        deck.shuffle();
        int card = deck.dealCard();
        players[0].addCard(card);
        players[0].hasPair();

        
    }

    
   

}
