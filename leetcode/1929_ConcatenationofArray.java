class Solution {
    public int[] getConcatenation(int[] nums) {

        int newLen = nums.length * 2;
        int[] longNums = new int[newLen];

        for (int i = 0; i < newLen; i++){
            
            longNums[i] = nums[i % nums.length];
        }

        return longNums;
    }
}
