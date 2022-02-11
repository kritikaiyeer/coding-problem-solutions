//given an array A, returns 1 if array A is a permutation and 0 if it is not.
// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> permutation = new HashSet<Integer>();
        int n = A[0];
        for(int i=0;i<A.length;i++){
            if(!permutation.add(A[i])){
                return 0;
            }
            if(A[i] > n){
                n = A[i];
            }
        }
        
        if(permutation.size() == n){
            return 1;
        }
        return 0;
    }
}
