
public class TheLargestElementInArray {
    

    private static int largestElement(int[] arr) {

        if (arr.length < 1 || arr == null) {
            throw new IllegalArgumentException("The array must contain at least 1 number");
        }

        int biggestNumber = arr[0];

        for (int i : arr) {
            if (i > biggestNumber) biggestNumber = i;
        }
        return biggestNumber;
    }

    public static void main(String[] args){

        int[] array = new int[] {1,2,546,4,513,78};
        System.out.println("Number: " + largestElement(array));
    }
}
