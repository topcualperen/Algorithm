import java.util.Arrays;

// Bir karakter dizisini (char[] s) yerinde (in-place) ters çevirin. Ekstra bellek kullanmayın.

public class ReverseString2{

    private static void reverseString(char[] s) {

        if (s == null || s.length <= 1) return;

        int left = 0;
        int right = s.length - 1;

        while (right > left) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void main(String[] args){

        char[] s = {'h','e','l','l','o'};

        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}