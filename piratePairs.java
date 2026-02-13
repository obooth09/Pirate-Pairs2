//import java.util.Arrays;

public class PiratePairs {

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player[] player = new Player[1];
        Player player1 = new Player();
       

        deck.shuffle();

        
    }

    
    public static int drawCard(int [] cards){
        int drawnCard = cards [0];
        for (int i = 0; i < cards.length -  1; i++){
            cards[i] = cards[i + 1];
        }
        cards[cards.length - 1] = 0;
        return drawnCard;
    }

}
