//Find the smallest positive integer that does not occur in a given sequence.
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int minPos = 1;
        HashMap<Integer,Integer> abc = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(abc.containsKey(A[i])){
                abc.put(A[i],abc.get(A[i]) + 1);
            }else{
                abc.put(A[i],1);
            }  
        }
        while(abc.containsKey(minPos)){
            minPos += 1; 
        }
        return minPos;
    }
}
