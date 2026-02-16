import java.util.Arrays;

public class Deck {
    private int[] cards;
    private int size;
    
    public Deck() {
        cards = new int [55];
        size = 0;

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                cards[size] = i;
                size ++;
            }
        }
    }

    public void shuffle(){
        for (int i = 0; i < size - 1; i++){
            int j = (int) (Math.random() * (i + 1));
            int temp = cards [i];
            cards[i] = cards [j];
            cards [j] = temp;
        }
    }

    public int dealCard(){
        int drawnCard = cards [0];
        //add something that changes the for loop into making a temp array
        for (int i = 0; i < size -  1; i++){
            cards[i] = cards[i + 1];
        }
        cards[size - 1] = 0;
        size--;
        return drawnCard;
    }

    public void show(){
        System.out.println(Arrays.toString(cards));
    }

    public void checkPair(){

    }
     
    
}
