class Solution {
    public int countWays(int n, int[] dp){
        if(n <= 1){
            return 1;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = countWays(n-1,dp) + countWays(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] memory = new int[n+1];
        Arrays.fill(memory,-1);
        return countWays(n,memory);
    }
}
