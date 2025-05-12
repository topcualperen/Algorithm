import java.util.HashSet;

// Bir array içinde tekrar eden ilk elemanı bulan algoritma

public class FirstDuplicate{

    private static Integer findFirstDuplicate(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){

            if (set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }

        return null;
    }

    public static void main(String[] args){

        int[] nums = new int[] {1,2,3,4,5,6,4,8,2,2};

        System.out.println(findFirstDuplicate(nums));
    }
}