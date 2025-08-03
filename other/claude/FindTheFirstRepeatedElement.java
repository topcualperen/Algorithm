import java.util.Set;
import java.util.HashSet;

public class FindTheFirstRepeatedElement{

    private static int firstrepeatedElement(int[] nums) {

        if (nums == null || nums.length < 2) {
            return -1;
        }

        Set<Integer> seenElement = new HashSet<>();

        for (int i : nums) {

            if (!seenElement.add(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] nums = new int[] {7,7};
        System.out.println(firstrepeatedElement(nums));
    }
}