class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        char[] ch = s.toCharArray();
        int count = 0;

        if (ch.length < 2 || ch.length % 2 != 0) return false;

        for (int i = 0; i < ch.length; i++){
            if (ch[0] == ')' || ch[0] == ']' || ch[0] == '}') {return false;}

            if (ch[i] == '(') {
                stack.push(')');
            }
            else if (ch[i] == '[') {
                stack.push(']');
            }
            else if (ch[i] == '{') {
                stack.push('}');
            }
            else if (stack.size() == 0) {
                return false;
            }

            else {
                if (stack.peek() == (ch[i])) stack.pop();
                count ++;
            }
        }
        
        if (stack.isEmpty() == true && count == ch.length / 2) return true;
        else return false;
    }
}