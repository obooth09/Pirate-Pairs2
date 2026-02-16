//import java.util.Arrays;

public class PiratePairs {
    //int losingScore = (60 / players.length) + 1;

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();

        deck.shuffle();
        for (int i = 0; i < players.length; i++){
            players[i].addCard(deck.dealCard());
        }
        //deck.show();

        int current = 0; // current person who is playing
        for (int i = 0; i < 10; i ++){
            int drawn = deck.dealCard();
            System.out.println("Player " + current + " draws a " + drawn);

            if (players[current].hasCard(drawn)){
                System.out.println("PAIR. Player " + current + " loses the round");
                players[current].clearHand(); 
            //later change the score here
            } else {
                players[current].addCard(drawn);
            }

            players[current].showHand();
            //i looked this up so that it goes back to player 1
            current = (current + 1) % players.length;
        }

        

        

        

        //players[0].hasPair();

        
    }

    
   

}
