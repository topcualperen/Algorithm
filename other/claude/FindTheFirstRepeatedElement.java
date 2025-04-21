import java.util.Set;
import java.util.HashSet;

public class FindTheFirstRepeatedElement{

    private static int firstrepeatedElement(int[] nums){

        if (nums.length <= 1) return -1;

        Set<Integer> set = new HashSet<>();

        for (int i : nums){

            if (set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }

    public static void main(String[] args){

        int[] nums = new int[] {7,7};
        System.out.println(firstrepeatedElement(nums));
    }
}