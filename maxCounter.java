// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counter = new int[N];
        int max = -1;
        int current_min = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>= 1 && A[i] <=N){
                if(counter[A[i] -1] < current_min){
                    counter[A[i] -1] = current_min;
                }
                counter[A[i] -1] += 1;
                if(counter[A[i] -1] > max){
                    max = counter[A[i] -1];
                }
            } 
            if(A[i] == N+1){
                current_min = max;
            }
        }
        for(int i=0;i<N;i++){
            if(counter[i]<current_min){
                counter[i] =current_min;
            }
        }

        return counter;
    }
}
