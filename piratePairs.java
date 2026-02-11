import java.util.Arrays;

public class PiratePairs {
    public static void main (String [] args) {
       int [] cards = new int [55];
        int value = 0;

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                cards[value] = i;
                value ++;
            }
        }
        //System.out.println(Arrays.toString(cards));
        shuffleDeck(cards);
    }

    public static void shuffleDeck(int [] cards){  
        for (int i = 0; i < cards.length - 1; i++){
            int j = (int) (Math.random() * (i + 1));

            int temp = cards [i];
            cards[i] = cards [j];
            cards [j] = temp;
        }
        
    System.out.println(Arrays.toString(cards));

    }
    public static int drawCard(int [] cards){
        int drawnCard = cards [0];
        return drawnCard;
        //find out how to remove the spot from the array
    }

}
