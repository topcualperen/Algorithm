import java.util.Arrays;

// verilen bir tamsayı dizisindeki en yakın iki sayıyı bulmak

public class ClosestPairWithNumbers{

    private static int[] findPairNumbers (int[] nums) {
        if (nums == null || nums.length < 2) return new int[]{};

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int[] resultArr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i + 1] - nums[i]) < minDiff) {
                minDiff = nums[i + 1] - nums[i];
                resultArr[0] = nums[i];
                resultArr[1] = nums[i + 1];

                if (nums[i + 1] - nums[i] == 0) break;
            }
        }
        return resultArr;
    }

    public static void main(String[] args){

        int[] nums = new int[] {1,27,34,52,150,53,17,5561,6,899};
        
        for (int i : findPairNumbers(nums)){
            System.out.println(i);
        }
    }
}