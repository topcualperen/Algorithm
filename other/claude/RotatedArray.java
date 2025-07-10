
/**
 *  Sıralanmış bir integer array'i, bilinmeyen bir pivot noktasından döndürülmüş durumda. 7
 *  Bu döndürülmüş array'de belirli bir hedef değeri arayın ve index'ini döndürün. Eğer hedef bulunamazsa -1 döndürün.
 *  Önemli: Algoritmanızın zaman karmaşıklığı O(log n) olmalı. 
 */

public class RotatedArray {
    
    private static int rotate(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == target) return i; 
        }
        
        return -1;
    }
    
    public static void main(String[] args) {

        int[] nums = new int[] {4,5,6,7,0,1,2};
        System.out.println(rotate(nums, 0));
    }
}