class Solution {
    public double myPow(double x, int n) {
      return Math.pow(x,n);
    }
}

// ask if n can be negative
class Solution {
    
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(nn < 0){
            nn = -1 * nn;
        }
        while(nn > 0){
            if(nn % 2 == 0){
                x = x * x;
                nn = nn/2;
            }else {
                ans = ans * x;
                nn = nn - 1;
            }
        }
        if(n < 0){
            return (double) 1.0 / (double) ans;
        }
        return ans;
    }
}
// Time complexity O(logn) divide and conquer
