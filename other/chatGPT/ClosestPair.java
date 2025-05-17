import java.util.Arrays;

// verilen bir tamsayı dizisindeki en yakın iki sayı arasındaki farkı bulmak

public class ClosestPair{


    private static int findClosestPair(int[] nums){

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++){

            int currentDiff = Math.abs(nums[i + 1] - nums[i]);
            if (currentDiff < diff) diff = currentDiff;
        }

        return diff;
    }

    public static void main(String[] args){

        int[] nums = new int[] {5,89,62,926,26,231};
        System.out.println(findClosestPair(nums));
    }
}