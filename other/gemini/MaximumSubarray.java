
/* 
 * Kadane’s Algorithm
 */

public class MaximumSubarray {

    private static int maxSubarray(int[] nums) {

        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], nums[i] + current);
            max = Math.max(max, current);
        }

        return max;
    }
    
    public static void main(String[] args){

        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarray(arr));
    }
    
}