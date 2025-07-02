
import java.util.Arrays;

public class SortedSquares {

    private static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {-4, -1, 100, 3, 10};
        
        for (int i : sortedSquares(arr)) {
            System.out.println(i);
        }
    }
}
