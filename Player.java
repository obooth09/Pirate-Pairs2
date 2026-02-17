public class Player {
    private int[] hand;
    private int handSize;
    private int score;
    private boolean eliminated;
    public Player() {
        hand = new int[10];
        handSize = 0;
        score = 0;
        eliminated = false;

    }

    public int getHandSize(){
        return handSize;
    }

    public void addScore(int points){
        score += points;
    }

    public int getScore(){
        return score;
    }

    public boolean isEliminated(){
        return eliminated;
    }
    //maybe change it to eliminate player if it makes more sense
    public void eliminate(){
        eliminated = true;
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
        System.out.print("hand: ");
        for (int i = 0; i < handSize; i++){
            System.out.print(hand[i] + ", ");
        }
        //System.out.println(Arrays.toString(hand));
    }

}
