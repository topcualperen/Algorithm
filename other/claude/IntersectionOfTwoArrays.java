import java.util.*;

public class IntersectionOfTwoArrays {
    

    private static int[] intersectionofTwoArrays(int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++){
            set.add(nums[i]);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < nums2.length; i++){
            if (set.contains(nums2[i])) resultSet.add(nums2[i]);
        }

        int[] resultArr = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet){
            resultArr[i++] = i; 
        }
    }

    public static void main(String[] args){

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,5,6,6,9};

        System.out.println(intersectionofTwoArrays(nums1, nums2));
    }
}
