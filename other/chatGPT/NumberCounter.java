import java.util.Scanner;

public class NumberCounter {
    
    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] nums = new int[] {2, 4, 6, 4, 4, 7};
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (number == nums[i]) counter ++;
        }

        System.out.println("The number " + number + " repeats " + counter + " times in the sequence.");
    }
}
