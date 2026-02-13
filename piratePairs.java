//import java.util.Arrays;

public class PiratePairs {

    public static void main (String [] args) {
        Deck deck = new Deck();
        Player player1 = new Player();
       
        //System.out.println(Arrays.toString(cards));
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
