//import java.util.Arrays;

public class PiratePairs {
    //int losingScore = (60 / players.length) + 1;

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();

        deck.shuffle();

        int current = 0; // current person who is playing

        int drawn = deck.dealCard();
        System.out.println("Player " + current + " draws a " + drawn);

        if (players[current].hasCard(drawn)){
            System.out.println("PAIR. Player" + current + " loses the round");
            players[current].clearHand(); 
            //later change the score here
        } else {
            players[current].addCard(drawn);
        }

        players[current].showHand();

        //players[0].hasPair();

        
    }

    
   

}
