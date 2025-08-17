package chatGPT;

public class ArmstrongCheck {

    private static boolean isArmstrongCheck(int number){
        int digitCount = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        int sum = 0;
        int originalNumber = number;
        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            sum += (int) Math.pow(remainder, digitCount);
            originalNumber /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args){
        int number = 153;
        System.out.println(isArmstrongCheck(number));
    }
}