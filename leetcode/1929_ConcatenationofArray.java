class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int newLength = 2 * nums.length;
        int[] newNums = new int[newLength];

        for (int i = 0; i < nums.length; i++){
            newNums[i] = nums[i];
            newNums[i + nums.length] = nums[i];
        }

        return newNums;
    }
}