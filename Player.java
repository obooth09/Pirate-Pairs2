import java.util.Arrays;
public class Player {
    private int[] hand;
    private int handSize = 0;
    public Player() {
        hand = new int[10];

    }

    public void addCard(int card){
        hand[handSize] = card;
        handSize++;
    }

    public boolean hasCard(int value){
        for (int i = 0; i < handSize; i++){
            if (hand[i] == value) {
                return true;
            }
        }
        return false;
    }


    public void clearHand(){
        for (int i = 0; i < handSize; i++){
            hand[i] = 0;
        }
        handSize = 0;
        //later add it to a discard pile which becomes the main pile if run out of cards
    }

    public void showHand(){
        System.out.println(Arrays.toString(hand));
    }

}
