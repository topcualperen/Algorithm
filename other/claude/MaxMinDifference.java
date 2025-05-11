package claude;

// Bir array içindeki en küçük ve en büyük sayının farkını bulan bir algoritma yazınız.

public class MaxMinDifference {

    private static int findMaxMinDifference(int[] nums){

        int maxNumber = Math.max(nums[0], nums[1]);
        int minNumber = Math.min(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){

            if (nums[i] > maxNumber) maxNumber = nums[i];
            else if (nums[i] < minNumber) minNumber = nums[i];
        }

        return maxNumber - minNumber;
    }

    public static void main(String[] args){

        int[] nums = new int[] {1,2,3,4,5,6,7,87};

        System.out.println(findMaxMinDifference(nums));
    }
    
}
