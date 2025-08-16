package chatGPT;

// Check If Array is Sorted

public class AscendingOrder {

    private static boolean isAscOrder(int[] arr) {
        if (arr == null) return false;
        if (arr.length <= 1) return true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,53,156,9645};
        System.out.println(isAscOrder(arr));
    }
}
