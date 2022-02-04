// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        int Z = Y;
        int dist = Y - X;
        double jump = (double)dist/D;
        double jumps = Math.ceil(jump);
        return (int)jumps;
    }
}
