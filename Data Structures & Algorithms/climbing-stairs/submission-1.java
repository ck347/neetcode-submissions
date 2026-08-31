class Solution {
    public int climbStairs(int n) {
        // base case n < 3
        if (n < 3) return n;

        // dynamic programming + memoization: store calculated values in array to reduce time
        int[] stairs = new int[n + 1];
        stairs[1] = 1;
        stairs[2] = 2;
        for (int i = 3; i < stairs.length; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
        return stairs[n];
    }
}
