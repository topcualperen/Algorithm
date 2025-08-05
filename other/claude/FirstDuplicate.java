import java.util.HashSet;
import java.util.Set;

// Bir array içinde tekrar eden ilk elemanı bulan algoritma

public class FirstDuplicate{

    private static Integer findFirstDuplicate(int[] nums) {

        if (nums == null || nums.length < 2) return null;

        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {

            if (!seen.add(i)) return i;
            System.out.println(i);
        }
        return null;
    }

    public static void main(String[] args){

        int[] nums = new int[] {1,2,3,4,5,6,4,8,2,2};

        System.out.println(findFirstDuplicate(nums));
    }
}