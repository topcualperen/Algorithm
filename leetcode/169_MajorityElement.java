class Solution {
    public int majorityElement(int[] nums) {
        
        // Boyer Moore

        int result = 0;
        int counter = 0;

        for (int i : nums){

            if (counter == 0) result = i;
            if (result == i) counter ++;
            else counter --;
        }
        return result;
    }
}