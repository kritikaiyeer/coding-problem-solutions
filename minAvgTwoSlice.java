// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int minIndex = 0;
        float min = Integer.MAX_VALUE;
        for(int i=1;i<A.length-2;i++){
           float avg1 = (float)(A[i] + A[i+1] + A[i+2])/3;
           float avg2 = (float)(A[i] + A[i+1])/2;
           if(Math.min(avg1,avg2) < min){
               min = Math.min(avg1,avg2);
               minIndex = i;
           }
        }
        float avg1 = (float)(A[A.length-1] + A[A.length-2])/2;
        if(avg1 < min){
            min = avg1;
            minIndex = A.length-2;
        }

        return minIndex;
    }
}
