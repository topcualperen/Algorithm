

public class VariableSubstitution{

    public static void main(String[] args){

        int a = 5;
        int b = 7;

        a += b;  // a = 5 + 7    a -> 12
        b = a - b;  // b = 12 - 7   b -> 5
        a -= b;  // a = 12 - 5   a -> 7

    }
}
// source: https://github.com/Mulakat-Adam/java-mulakat-sorulari/blob/main/src/Q13.java