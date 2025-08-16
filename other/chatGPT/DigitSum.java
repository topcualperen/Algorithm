package chatGPT;

/*
 *  decompose a positive number into its digits and find the sum of its digits
 *  input: 456  4 + 5 + 6 = 15
 */

public class DigitSum {

    private static int digitsSum(int number) {
        if (number < 0) return -1;

        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits; 
    }

    public static void main(String[] args){
        int number = 0;
        System.out.println(digitsSum(number));
    }
}