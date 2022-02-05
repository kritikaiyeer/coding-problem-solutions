// For example, consider array A such that:

//   A[0] = 3
//   A[1] = 1
//   A[2] = 2
//   A[3] = 4
//   A[4] = 3
// We can split this tape in four places:

// P = 1, difference = |3 − 10| = 7
// P = 2, difference = |4 − 9| = 5
// P = 3, difference = |6 − 7| = 1
// P = 4, difference = |10 − 3| = 7
// Write a function:

// class Solution { public int solution(int[] A); }

// that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int numberRight = 0;
        for(int i=0;i<A.length;i++){
            numberRight +=A[i];
        }
        int numberLeft = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length-1;i++){ //dont consider last element imp !!
            numberRight -=A[i];
            numberLeft += A[i];
            if(Math.abs(numberLeft - numberRight) < min){
                min = Math.abs(numberLeft - numberRight);
            }
        }
        return min;
    }
}
TC: O(N)
