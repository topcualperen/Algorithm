public class StringReversal {

    private static String reverseString(String word){

        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();

        return reversedWord;
    }

    public static void main(String[] args){
        
        System.out.println("Reversed Word: " + reverseString(new String("Hello World")));
    }
}