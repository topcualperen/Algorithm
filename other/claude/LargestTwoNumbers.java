


/*
Finding the Two Largest Numbers in an Array
"You are given an array of integers. Please find the two largest numbers in this array. Explain your approach and code your solution."
Example Input: [3, 10, 5, 8, 12, 1, 9]
Expected Output: [12, 10]
 */

 

public class LargestTwoNumbers {


    private static int[] largestTwoNumbers(int[] arr){

        int firstOne = Math.max(arr[0], arr[1]);
        int secondOne = Math.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++){
            
            if (arr[i] > firstOne){
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
