public static void staircase(int n) {

    for (int i = 1; i <= n; i++){
        for (int j = n - 1; j >= i; j--){
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++){
            System.out.print("#");
        }
        System.out.println();
    }
}