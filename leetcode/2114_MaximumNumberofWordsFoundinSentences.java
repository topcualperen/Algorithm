class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxCount = 0;

        for (String s : sentences){
            int currCount = s.split(" ").length;
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }
}