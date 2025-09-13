
public class CalculateAverage {
    
    private static int calculateAverageNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int averageNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            averageNumber += nums[i];
        }
        return averageNumber / nums.length;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] {10,20,30,40,50,60,70};
        System.out.println(calculateAverageNumber(nums));
    }
}