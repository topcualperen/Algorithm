class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int reverseNumber = 0;
        int number = x;

        while (number > 0){
            int step = (int) number % 10;
            reverseNumber = reverseNumber * 10 + step;
            number /= 10;
        }

        if (reverseNumber == x) return true;
        else return false;
    }
}