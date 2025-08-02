


/*
Finding the Two Largest Numbers in an Array
"You are given an array of integers. Please find the two largest numbers in this array. Explain your approach and code your solution."
Example Input: [3, 10, 5, 8, 12, 1, 9]
Expected Output: [12, 10]
 */

 

public class LargestTwoNumbers {


    private static int[] largestTwoNumbers(int[] arr){

        if (arr.length < 2 || arr == null) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }

        int firstOne, secondOne;

        if (arr[0] > arr[1]) {
            firstOne = arr[0];
            secondOne = arr[1];
        }else {
            firstOne = arr[1];
            secondOne = arr[0];
        }

        for (int i = 2; i < arr.length; i++){
            
            if (arr[i] >= firstOne){
                secondOne = firstOne;
                firstOne = arr[i];
            }else if (arr[i] > secondOne) secondOne = arr[i];
        }

        return new int[] {firstOne, secondOne};
    }

    public static void main(String[] args){

        int[] array = new int[] {1,5,8,978,5456,24,65,3,88};
        
        for (int i : largestTwoNumbers(array)){
            System.out.println(i);
        }
    }
}
