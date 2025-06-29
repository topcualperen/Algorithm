
public class ArmstrongCheck {

    private static boolean armstrongCheck(int num){

        int digit = 0;

        int number2 = num;

        while (number2 > 0) {
            number2 /= 10;
            digit ++;
        }

        if (digit != 3) return false;

        int sum = 0;

        int number = num;

        while (number > 0) {

            int remainder = number % 10;
            sum += remainder * remainder * remainder;
            number /= 10;
        }

        if (sum == num) return true;
        return false;
    }

    public static void main(String[] args){

        int number = 123;
        System.out.println(armstrongCheck(number));
    }
}