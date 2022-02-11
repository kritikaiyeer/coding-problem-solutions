//
// CountDiv
//Compute number of integers divisible by k in range [a..b].
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        
        if(A%K == 0){
            int a = A / K;
            int b = B/K;
            return b - a + 1;
        }
        return (B/K) - (A/K);
    }
}
