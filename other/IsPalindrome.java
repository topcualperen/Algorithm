
public class IsPalindrome{
    private static boolean isPalindrome(int number){
        if (number < 0 || number % 10 == 0 && number != 0) return false;
        else if (number < 10) return true;
        
        int reversed = 0;
        while (number > reversed) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return number == reversed || number == reversed / 10;
    }

    public static void main(String[] args){
        int num = 57775;
        System.out.println(isPalindrome(num));
    }
}