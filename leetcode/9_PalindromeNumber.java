class Solution {
    public boolean isPalindrome(int x) {

        Integer number = x;

        String strNumber = number.toString();
        StringBuilder sb = new StringBuilder(strNumber);
        String reverseStrNumber = sb.reverse().toString();
        
        if(strNumber.equals(reverseStrNumber)) return true;
        else return false;

    }
}