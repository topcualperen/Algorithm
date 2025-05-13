import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Verilen iki array'in kesişimini bulan bir algoritma

public class ArrayIntersection {
    

    private static int[] findIntersection(int[] nums1, int[] nums2){

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int j = 0; j < nums1.length; j++){
            set.add(nums1[j]);
        }

        for (int i = 0; i < nums2.length; i++){

            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
            }
        }

        int[] intersectionArray = new int[list.size()];

        for (int k = 0; k < list.size(); k++){
            intersectionArray[k] = list.get(k);
        }

        return intersectionArray;
    }

    public static void main(String[] args){

        int[] nums1 = new int[] {1,2,3,4,5,60,5};
        int[] nums2 = new int[] {10,20,30,40,50,60,1,2,7};

        for (int i : findIntersection(nums1, nums2)){
            System.out.println(i);
        }
    }
}