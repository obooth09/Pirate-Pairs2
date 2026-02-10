import javax.smartcardio.Card;

public class piratePairs {
    public static void main (String [] args) {
        Card [] cards = new Card[55];
        int value = 0;

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                cards[value++] = new Card(j);
            }
        }
        System.out.println(value);

        //when you draw a card make sure to take it away from the array
    }
}
