//import java.util.Arrays;

public class PiratePairs {
    //int losingScore = (60 / players.length) + 1;

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
       

        deck.shuffle();
        deck.show();
        int card = deck.dealCard();
        deck.show();
        players[0].addCard(card);
        //players[0].showHand();
        players[1].addCard(card);
        players[1].showHand();
        players[0].addCard(card);
        players[0].showHand();

        //players[0].hasPair();

        
    }

    
   

}
