import java.util.Arrays;

public class ReverseWords {

    private static String reverseWords(String s) {

        String[] sArray = s.trim().split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = sArray.length - 1; i >= 0; i--) {
            stringBuilder.append(sArray[i]);

            if (i > 0) stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        String str = "             the sky  is blue";
        System.out.println(reverseWords(str));
    }
}
