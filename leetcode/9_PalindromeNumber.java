class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int reverseNumber = 0;
        int number = x;

        while (number > 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        return reverseNumber == x;
    }
}