public class Player {
    private int[] hand;
    private int handSize;
    public Player() {
        hand = new int[10];

    }

    public void addCard(int card){
        hand[handSize] = card;
        handSize++;
    }

    public boolean hasPair(){
        for (int i = 0; i < handSize; i++){
            for (int j = 0; j < handSize; j++){
                if (hand[i] == hand[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public void clearHand(){
        for (int i = 0; i < handSize; i++){
            hand[i] = 0;
        }
        handSize = 0;
    }

}
