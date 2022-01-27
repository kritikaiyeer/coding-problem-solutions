class Solution {
    public int countPaths(int i, int j,int n, int m){
       
        if(i == (n-1) && j == (m -1)){
            return 1;
        }
         if(i >= n || j>= m ){
            return 0;
        } 
        return countPaths(i+1,j,n,m) + countPaths(i,j+1,n,m);
    }
    
    public int uniquePaths(int m, int n) {
        return countPaths(0,0,m,n);
    }
}

// recursive and doesnt work for lot of test cases
// TC: exponential

class Solution {
    public int countPaths(int i, int j,int n, int m,int[][] dp){
       
        if(i == (n-1) && j == (m -1)){
            return 1;
        }
         if(i >= n || j>= m ){
            return 0;
        } 
        if(dp[i][j] != -1) return dp[i][j];
        else return dp[i][j] = countPaths(i+1,j,n,m,dp) + countPaths(i,j+1,n,m,dp);
    }
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row: dp)
            Arrays.fill(row, -1);
        return countPaths(0,0,m,n,dp);
    }
}

// convert recursive method to dp by storing the result of each recursive call and reducing sub overlaps
// TC: (N*M) SP: (N*M)

class Solution {
    
    public int uniquePaths(int m, int n) {
        int N = m + n -2; // how? see notebook
        int r = m -1; // how ? see notebook
        double res = 1.0;
        // find NCombinationR
        for(int i=1;i<=r;i++){
            res = (res * (N - r + i))/ i; 
        }
        return (int)res;
    }
}
// TC: O(N) SP(1);
