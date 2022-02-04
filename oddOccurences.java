// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int i =0;
        while(i< A.length-1){
            if(A[i] == A[i+1]){
                i = i +2;
            }else{
             return A[i];
            }
        }
        
        return A[A.length -1];
    }
}
