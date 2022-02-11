//1. PassingCars
//Count the number of passing cars on the road.

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int passingcars = 0;
        int increment = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == 0){
                increment += 1;
            }
            if(A[i] == 1){
                passingcars += increment;
                if(passingcars > 1000000000){
                    return -1;
                }
            }
        }
        return passingcars;
    }
}
