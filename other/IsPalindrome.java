

public class IsPalindrome{

    private static boolean isPalindrome(int number){

        if (number < 0) return false;

        int original = number;
        int reverseNumber = 0;

        while (original > 0) {
            reverseNumber = reverseNumber * 10 + original % 10;
            original /= 10;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args){

        int num = 578775;
        System.out.println(isPalindrome(num));
    }
}