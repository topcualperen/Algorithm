
public class Prime{
    
    private static boolean isPrime(int number){

        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(number); i+=2){

            if (number % i == 0) return false;
        }

        return true;
    }
    
    public static void main(String[] args){

        int num = 17;

        System.out.println("is prime: " + isPrime(num));
    }
}