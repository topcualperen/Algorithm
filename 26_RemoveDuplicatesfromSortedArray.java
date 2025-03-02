class Solution {
    
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;
        // 10, 20, 20, 30, 50
        int slow = 0;
        int fast = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast ++;
        }
        return slow + 1;
    }
}