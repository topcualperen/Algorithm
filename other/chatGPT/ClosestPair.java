import java.util.Arrays;

// verilen bir tamsayı dizisindeki en yakın iki sayı arasındaki farkı bulmak

public class ClosestPair{


    private static int findClosestPair(int[] nums) {
        
        if (nums == null || nums.length < 2) return -1;
        
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = Math.abs(nums[i + 1] - nums[i]);
            if (diff == 0) return 0;
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }

    public static void main(String[] args){

        int[] nums = new int[] {5,89,62,926,26,231};
        System.out.println(findClosestPair(nums));
    }
}