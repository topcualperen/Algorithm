import java.util.*;

public class IntersectionOfTwoArrays {
    

    private static int[] intersectionofTwoArrays(int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int j = 0; j < nums2.length; j++){
            if (set.contains(nums2[j])) resultSet.add(nums2[j]);
        }

        int[] resultArr = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet){
            resultArr[i++] = num; 
        }

        return resultArr;
    }

    public static void main(String[] args){

        int[] nums1 = {51,2,2,1};
        int[] nums2 = {1,51,6,6,9};

        for (int i : intersectionofTwoArrays(nums1, nums2)){
            System.out.println(i);
        }
    }
}
