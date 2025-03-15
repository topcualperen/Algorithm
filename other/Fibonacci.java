public class Fibonacci {

    public static void main(String[] args){

    int number = 8;
    int a = 0;
    int b = 1;

    for (int i = 0; i < number; i++){
        
        System.out.print(a + "  ");
        int toplam = a + b;
        a = b;
        b = toplam;
    }
    }
}
