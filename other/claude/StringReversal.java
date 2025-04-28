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

/*

    Bu şekilde çözüm olursa,

    Java'da String nesneleri değişmezdir. İlk algoritmadaki reverseWord += word.charAt(i) işlemi 
    her iterasyonda yeni bir String nesnesi oluşturur ve bu, uzun metinlerde ciddi performans sorunlarına yol açar.


   private static String reverseString(String word){

    String reverseWord = "";

    for (int i = word.length() - 1; i >= 0; i--){

        reverseWord += word.charAt(i);
    }

    return reverseWord;
}
  
 */