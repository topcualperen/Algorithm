class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int wordLength = 0;
            if (word1.length() > word2.length()) wordLength = word1.length();
            else wordLength = word2.length();
    
            String output = "";
    
            for (int i = 0; i < wordLength; i++) {
                if (word1.length() > i){
                    output += word1.charAt(i);
                }
                if (word2.length() > i){
                    output += word2.charAt(i);
                }
            }
            return output;
    }
}
