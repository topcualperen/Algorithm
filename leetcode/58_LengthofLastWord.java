class Solution {
    public int lengthOfLastWord(String s) {
        
        String trimS = s.trim();
        
        int counter = 0;

        for (int i = trimS.length() - 1; i >= 0; i--){

            if (trimS.charAt(i) == ' ') break;
            counter++;
        }
        return counter;
    }
}