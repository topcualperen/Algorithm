public class RightBasedTriangle {
    
    public static void main(String[] args){

        int num = 5;

        for (int k = 1; k <= num; k++){
            for (int m = num - 1; m >= k; m--){
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
