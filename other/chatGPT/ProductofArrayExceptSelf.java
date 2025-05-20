
public class ProductofArrayExceptSelf {

    private static int[] productExceptSelf(int[] nums){

        int[] resultNums = new int[nums.length];

        int total = 1;

        for (int j : nums){
            total *= j;
        }

        for (int i = 0; i < nums.length; i++){
            resultNums[i] = total / nums[i];
        }

        return resultNums;
    }

    public static void main(String[] args){

        int[] num = new int[] {1,2,4,5};
        for (int i : productExceptSelf(num)){
            System.out.print(i + " ");
        }
    }
}
