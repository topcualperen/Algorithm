
public class ReverseArray {
    
    private static int[] reverseArr(int[] nums){

        if (nums.length < 0 || nums.length == 0) return new int[] {};

        int left = 0;
        int right = nums.length - 1;

        while (right > left){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right --;
            left ++;
        }

        return nums;
    }

    public static void main(String[] args){

        int[] num = new int[] {4,4,5,6,78,964,8,2};

        for (int i : reverseArr(num)){
            System.out.print(i + " ");
        }
    }
}
