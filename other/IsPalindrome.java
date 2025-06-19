

public class IsPalindrome{

    private static boolean isPalindrome(int number){

        if (number < 0) return false;

        int proxyNumber = number;
        int reverseNumber = 0;

        while (proxyNumber > 0) {

            int remainder = proxyNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            proxyNumber = proxyNumber / 10;
        }

        if (number == reverseNumber) return true;
        return false;
    }

    public static void main(String[] args){

        int num = 5775;
        System.out.println(isPalindrome(num));
    }
}