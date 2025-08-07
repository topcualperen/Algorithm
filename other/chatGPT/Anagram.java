
/*
 *  - Burada Arrays.equals yapmamızın sebebi dizilerin Object sınıfından türemesinden dolayı 
 *  equals() metotunu override edilmemiş olmasıdır. Edilmediği için de
 *  sChar.equals(tChar) yazdığımızda değer karşılaştırması yerine referans karşılaştırması yapacak olmasıdır.
 * 
 *  - Stringler ise equals() metotunu override ettikleri için referans karşılaştırması yerine değer karşılaştırması yapabilir.
 */

import java.util.Arrays;

public class Anagram{

    private static boolean isAnagram (String s, String t) {
        if (s == null || s == null || s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public static void main(String[] args){

        String s = "alpa";
        String t = "lpaa";

        System.out.println(isAnagram(s, t));
    }
}