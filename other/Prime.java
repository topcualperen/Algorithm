

public class Prime {
    
    private static boolean isPrime(int number) {

        if (number == 2 ||number == 3) return true;
        if (number < 2 || number % 2 == 0) return false;

        for (int i = 1; i <= Math.sqrt(number); i +=2) {

            if (number % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {

        int number = 2;
        System.out.println(isPrime(number));
    }
}