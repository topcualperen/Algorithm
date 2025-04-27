public class Fibonacci {

    private static void fibo(int num){

        int m = 0;
        int n = 1;

        for (int i = 0; i < num; i++){

            System.out.println(m);
            int sum = m + n;
            m = n;
            n = sum;
        }
    }

    public static void main(String[] args){

        int num = 6;
        fibo(num);
    }
}
