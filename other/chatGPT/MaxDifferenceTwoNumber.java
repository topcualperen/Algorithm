
public class MaxDifferenceTwoNumber{

    private static int maxDifference(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {

            if (i > max) max = i;
            if (i < min) min = i;
        }

        return max - min;
    } 

    public static void main(String[] args){

        int[] arr = new int[] {1,321,651,3,1,78};
        System.out.println(maxDifference(arr));
    }
}