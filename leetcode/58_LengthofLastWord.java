class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        StringBuilder sb = new StringBuilder(s);
        String reverseS = sb.reverse().toString();
        int count = 0;

        for (int i = 0; i < reverseS.length(); i++){
            
            if (reverseS.charAt(i) == ' ') break;
            count ++;
        }

        return count;
    }
}