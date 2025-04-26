class Solution {
    public int majorityElement(int[] nums) {
        
        // Boyer–Moore majority vote algorithm

        int candidate = 0;
        int count = 0;

        for (int num : nums){

            if (count == 0) candidate = num;
            if (candidate == num) count ++;
            else count --;
        }

        return candidate;
    }
}