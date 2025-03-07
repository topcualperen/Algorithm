class Solution {
    public boolean isPalindrome(String s) {
        
        String cleanS = s.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        
        String reverseWord = "";

        for (int i = cleanS.length() - 1; i >= 0; i--){
            reverseWord += cleanS.charAt(i);
        }

        if (reverseWord.equals(cleanS)) return true;
        else return false;
    }
}