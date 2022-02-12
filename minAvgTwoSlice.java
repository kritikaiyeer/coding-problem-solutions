// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int minIndex = 0;
        double min = Integer.MAX_VALUE;
        for(int i=0;i<A.length-2;i++){
           double avg1 = (double)(A[i] + A[i+1] + A[i+2])/3;
           double avg2 = (double)(A[i] + A[i+1])/2;
           if(avg1 < min || avg2 <min){
               min = Math.min(avg1,avg2);
               minIndex = i;
           }
        }
        double avg1 = (double)(A[A.length-1] + A[A.length-2])/2;
        if(avg1 < min){
            min = avg1;
            minIndex = A.length-2;
        }

        return minIndex;
    }
}
