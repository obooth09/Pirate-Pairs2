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
        System.out.println(Arrays.toString(cards));
    }
    
}
