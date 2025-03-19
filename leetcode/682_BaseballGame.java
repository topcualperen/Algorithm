class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < operations.length; i++){
            
            if (operations[i].equals("C")){
                stack.pop();
            }else if (operations[i].equals("D")){
                stack.push(stack.peek() * 2);
            }else if (operations[i].equals("+")){
                int top = stack.pop();
                int newTop = stack.peek();
                stack.push(top);
                stack.push(top + newTop);
            }else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        for (int i : stack){
            result += i;
        }

        return result;
    }
}