
public class ContainerWithMostWater{

    /* 
        Yükseklikleri height[i] olan dikey çizgilerden bir dizi veriliyor. 
        İki çizgi seçip, x-ekseniyle arasında su tutabilecek maksimum alanı bulun.
    */

    private static int maxArea(int[] height){

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (right > left){

            int w = right - left;
            int h = Math.min(height[right], height[left]);

            maxArea = Math.max(maxArea, h * w);

            if (height[right] > height[left]) left ++;
            else right --;
        }

        return maxArea;
    }

    public static void main(String[] args){

        int[] nums = new int[] {8,9,5,4,4,8,3,2};
        System.out.println(maxArea(nums));
    }
}