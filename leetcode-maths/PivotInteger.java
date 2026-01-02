class Solution {
    public int pivotInteger(int n) {
        int pivotNumber = (int) Math.sqrt(n * (n + 1) / 2);
        int sum = 0;
        while (n >= pivotNumber) {
            sum += n;
            n--;
        }
        if( ((pivotNumber * (pivotNumber + 1)) / 2) == sum ) {
            return pivotNumber;
        }else return -1;
    }
}