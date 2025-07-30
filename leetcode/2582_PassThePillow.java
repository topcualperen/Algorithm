class Solution {
    public int passThePillow(int n, int time) {

        int cycle = time % (2 * (n - 1));
        if (cycle < n) {
            return 1 + cycle;
        } else {
            return n - (cycle - (n - 1));
        }
    }
}