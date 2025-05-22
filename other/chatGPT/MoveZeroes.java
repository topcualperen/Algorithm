

/*
 * 
 *  Verilen bir tamsayı dizisi nums, dizideki tüm sıfırları koruyarak 
 *  diğer tüm öğelerin görece sırasını bozmadan dizinin sağ tarafına taşıyın. 
 *  Bunu yerinde (in-place), ekstra dizi kullanmadan yapın.
 * 
 */

public class MoveZeroes {
    
    private static int[] moveZeroes(int[] nums){

        int temp = 0;

        for (int i = 0; i < nums.length; i++){
            
            if (nums[i] != 0) nums[temp++] = nums[i];
        }

        for (int i = temp; i < nums.length; i++){
            nums[i] = 0;
        }

        return nums;
    }

    public static void main(String[] args){

        int[] nums = new int[] {1,6,0,3,12,0};

        for (int i : moveZeroes(nums)){
            System.out.print(i + " ");
        }
    }
}
