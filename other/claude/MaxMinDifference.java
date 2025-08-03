
// Bir array içindeki en küçük ve en büyük sayının farkını bulan bir algoritma yazınız.

public class MaxMinDifference {

    private static int findMaxMinDifference(int[] nums) {

        if (nums == null || nums.length < 2) return -1;

        int minNumber = nums[0];
        int maxNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < minNumber) minNumber = nums[i];
            if (nums[i] > maxNumber) maxNumber = nums[i];
        }

        return maxNumber - minNumber;
    }

    public static void main(String[] args){

        int[] nums = new int[] {1,2,3,4,5,6,7,87};

        System.out.println(findMaxMinDifference(nums));
    }
    
}
