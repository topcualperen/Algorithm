public class StringReversal {

    private static String reverseString(String word){

        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();

        return reversedWord;
    }

    public static void main(String[] args){
        
        String word = "Hello World";
        System.out.println("Reversed Word: " + reverseString(word));
    }
}