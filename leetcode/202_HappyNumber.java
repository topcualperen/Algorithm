class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)){
            
            set.add(n);
            n = getNext(n);
        }

        if (!set.contains(n) && n == 1) return true;
        else return false;
    }

    private static int getNext(int n){

        int sum = 0;

            while (n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
            }

        return sum;
    } 
}