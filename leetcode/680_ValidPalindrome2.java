class Solution {
    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (right > left) {

            if (s.charAt(left) == s.charAt(right)) {
                left ++;
                right --;
            }
            else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {

        while (right > left) {

            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}