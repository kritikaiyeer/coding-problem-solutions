// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//BRUTE FORCE--
class Solution {
    public int[] solution(int[] A, int K) {
        int[] res = new int[A.length];
        int j = K;
        if(K == 0){
            return A;
        }
        while(j != 0){
            res = new int[A.length];
            for(int i=0;i<A.length;i++){
                if(i == A.length - 1){
                    res[0] = A[i];
                }else{                    
                    res[i+1] = A[i];
                }    
            }
            A = res;
            j--;
        }
         return res;   
    }    
  
}

