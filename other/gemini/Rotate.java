
/* 
    Verilen bir nums dizisini, k adım sağa döndürün. k negatif olmayan bir tamsayıdır.

    Örnek:

        Girdi: nums = [1,2,3,4,5,6,7], k = 3
        Çıktı: [5,6,7,1,2,3,4]
*/

import java.util.Arrays;

public class Rotate {

    private static void reverse(int[] nums, int start, int end) {
        while (end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }

    private static int[] rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        return nums;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int number = 3;

        System.out.println(Arrays.toString(rotate(arr, number)));
    }
}