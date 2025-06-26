

/*
 *  decompose a positive number into its digits and find the sum of its digits
 *  input: 456  4 + 5 + 6 = 15
 */

public class DigitSum {

    private static int digitsSum(int number){

        int num = number;
        int result = 0;

        while (num > 0){
            int remainder = num % 10;
            result += remainder;
            num /= 10;
        }

        return result;
    }


    public static void main(String[] args){

        int number = 4556;
        System.out.println(digitsSum(number));
    }
}