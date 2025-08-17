package chatGPT;

public class DigitCounter {
 
    private static int digitCounter(int num){
        int counter = 0;
        while (num > 0) {
            num /= 10;
            counter ++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int number = 8654;
        System.out.println(digitCounter(number));
    }
}