
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
