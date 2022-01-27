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
