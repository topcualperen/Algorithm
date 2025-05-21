import java.util.ArrayList;
import java.util.List;

public class Anagram{

    private static boolean isAnagram(String s, String t){

        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();

        boolean resultChar = false;

        for (char c : s.toCharArray()){
            listS.add(c);
        }

        for (char c2 : t.toCharArray()){
            listT.add(c2);
        }

        if (listS.size() == listT.size()){
         
            resultChar = true;

            for (char c3 : t.toCharArray()){
                if (!listS.contains(c3)) {
                    resultChar = false;        
                    break;
                } 
            }

        }

        return resultChar;
    }

    public static void main(String[] args){

        String s = "alpa";
        String t = "lpaaa";

        System.out.println(isAnagram(s, t));
    }
}