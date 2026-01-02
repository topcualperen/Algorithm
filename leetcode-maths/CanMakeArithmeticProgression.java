class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int fark = arr[1] - arr[0];
        boolean result = false;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) != fark) {
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }
}