class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int longWordLen = 0;
        if (word1.length() > word2.length()) longWordLen = word1.length();
        else longWordLen = word2.length();

        // abc - xyz -> axbycz

        String outputString = "";
    
        for (int i = 0; i < longWordLen; i++){

            if (word1.length() > i) outputString += word1.charAt(i);
            if (word2.length() > i) outputString += word2.charAt(i);
        }

        return outputString;
    }
}