class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (right > left){

            if (s.charAt(left) != s.charAt(right)) return false;
                right--; left++;
            }

        return true;
    }
}