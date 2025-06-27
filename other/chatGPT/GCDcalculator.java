
/*  
 * 
 * Write a function that calculates the Greatest Common Divisor (GCD) of two integers using a loop.
 * 
 */

public class GCDcalculator{

    private static int gcdCalculator(int num1, int num2){

        int gcdNumber = 1;

        for (int i = 1; i < Math.min(num1, num2); i++){

            if (num1 % i == 0 && num2 % i == 0) {
                gcdNumber = i;
            }
        }

        return gcdNumber;
    }


    public static void main(String[] args){

        int number1 = 60;
        int number2 = 36;

        System.out.println(gcdCalculator(number1, number2));
    }
}