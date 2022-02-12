// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] res = new int[P.length];
        int[][] prefixSum = new int[3][S.length()+1];
        for(int i=0;i<S.length();i++){
            int a = 0;
            int b = 0;
            int c = 0;
            if(S.charAt(i) == 'A'){
                a++;
            }
            if(S.charAt(i) == 'C'){
                b++;
            }
            if(S.charAt(i) == 'G'){
                c++;
            }
            prefixSum[0][i+1] = prefixSum[0][i] + a;
            prefixSum[1][i+1] = prefixSum[1][i] + b;
            prefixSum[2][i+1] = prefixSum[2][i] + c;
            
        }
        for(int i=0;i<res.length;i++){
            int from = P[i];
            int to = Q[i]+1;
            if(prefixSum[0][to] - prefixSum[0][from] > 0){
                res[i] = 1;
            }else if (prefixSum[1][to] - prefixSum[1][from] > 0){
                res[i] = 2;
            }else if (prefixSum[2][to] - prefixSum[2][from] > 0){
                res[i] = 3;
            }else{
                res[i] = 4;
            }
        }


        return res;
    }
}
