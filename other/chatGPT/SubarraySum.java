import java.util.HashMap;

class SubarraySum{

    private static int subarraySum(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == k) count ++;
            else if (map.containsKey(k - nums[i])) map.put(nums[i], count++); 
            map.put(nums[i], count);
        }

        return count;
    }

    public static void main(String[] args){

        int k = 3;
        int[] num = new int[] {1,2,3};

        System.out.println(subarraySum(num, k));
    }
}