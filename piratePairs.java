//import java.util.Arrays;

public class PiratePairs {
    //int losingScore = (60 / players.length) + 1;

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
        int losingScore = (60 / players.length) + 1;
        System.out.println("Losing Score is " + losingScore);

        deck.shuffle();
        for (int i = 0; i < players.length; i++){
            players[i].addCard(deck.dealCard());
        }
        //deck.show();

        int current = 0; // current person who is playing
        while (deck.countActivePlayers(players) > 1){
            int drawn = deck.dealCard();
            System.out.println("Player " + current + " draws a " + drawn);

            if (players[current].hasCard(drawn)){
                System.out.println("PAIR. Player " + current + " loses the round");
                //add the number of the card to their score
                players[current].addScore(drawn);
                System.out.println("Player " + current + " gains " + drawn + " points");
                System.out.println("Total score: " + players[current].getScore());
                players[current].clearHand(); 

                if (players[current].getScore() > losingScore) {
                    players[current].eliminate();
                    System.out.println("player " + current + " is eliminated!!!!");
                }
            } else {
                players[current].addCard(drawn);
            }

            players[current].showHand();
            //i looked this up so that it goes back to player 1
            current = (current + 1) % players.length;
        }

        
    }

    
   

}
