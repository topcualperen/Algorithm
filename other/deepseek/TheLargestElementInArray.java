
public class TheLargestElementInArray {
    

    private static int largestElement(int[] arr){

        int biggestNumber = arr[0];

        for (int i = 1; i < arr.length; i++){
            
            if (arr[i] > biggestNumber) biggestNumber = arr[i];
        }

        return biggestNumber;
    }

    public static void main(String[] args){

        int[] array = new int[] {1,2,546,4,513,78};
        System.out.println("Number: " + largestElement(array));
    }
}
