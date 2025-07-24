class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
         
            while(prefix.length() > 0) {

                if(strs[i].startsWith(prefix)) {
                    break;
                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }
}