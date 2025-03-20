class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.length() == 1) return true;

        String newString = s.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(newString);

        if (newString.equals(sb.reverse().toString())) return true;
        else return false;
    }
}