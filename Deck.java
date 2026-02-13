public class Deck {
    private int[] cards;
    
    public Deck() {
        int [] cards = new int [55];
        int value = 0;

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                cards[value] = i;
                value ++;
            }
        }
    }

    public void shuffle(){
        for (int i = 0; i < cards.length - 1; i++){
            int j = (int) (Math.random() * (i + 1));
            int temp = cards [i];
            cards[i] = cards [j];
            cards [j] = temp;
        }
    }
    
}
