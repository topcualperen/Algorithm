import java.util.Arrays;

// verilen bir tamsayı dizisindeki en yakın iki sayıyı bulmak

public class ClosestPairWithNumbers{

    private static int[] findPairNumbers(int[] nums){

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;
        int[] resultArr = new int[2];

        for (int i = 0; i < nums.length - 1; i++){

            int currentDiff = Math.abs(nums[i + 1] - nums[i]);

            if (currentDiff < diff) {

                diff = currentDiff;
                resultArr[0] = nums[i];
                resultArr[1] = nums[i + 1];
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