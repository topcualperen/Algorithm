
public class CountOccurrences {
    
    private static int countOccurrences(int[] arr, int target){

        int count = 0;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == target) count ++;
        }

        return count;
    }



    public static void main(String[] args){

        int[] arr = new int[] {1,2,315,1,53,135,1,32};
        int target = 1;
        System.out.println(countOccurrences(arr, target));
    }
}