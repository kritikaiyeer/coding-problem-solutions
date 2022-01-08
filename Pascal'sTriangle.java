// Return the complete pascals triangle for n numofRows
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> num = new ArrayList<Integer>();
        num.add(1);
        result.add(num);
        while(numRows > 1){
            List<Integer> num1 = new ArrayList<Integer>();
            List<Integer> num2 = result.get(result.size() -1);
            int len = num2.size();
            if(len == 1){
                num1.add(1);
                num1.add(1);
                result.add(num1);
            } else {
                int i = 0;
                num1.add(1);
                while(i != len-1){
                 int mid = num2.get(i) + num2.get(i+1);
                 num1.add(mid);
                 i++;
                }
                num1.add(1);
                result.add(num1);
            }
            numRows --;
        }
        return result;
    }
}

//Alternative way
class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i <= rowIndex; i++){
            List<Integer> num = new ArrayList<Integer>();
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == i){
                    num.add(1);
                }else{
                    int a = res.get(i-1).get(j-1);
                    int b = res.get(i-1).get(j);
                    num.add(a+b);
                }
            }
            res.add(num);
        }
        return res;
    }
}

// Time complexity - O(N*M) Space Complexity - O(NM)

// To get element of a pascal triangle at row 5 col 3 thw formula is - ^(R-1) C(C-1) (C is combination vala C) = 4C2 = 4*3/2*1 = 6 is answer. Time complexity of this is O(N)
// Print Nth eg here 5th row of pascal triangle = use same formula 1st value is 4C0 = 1 and second ia 4C1 = 4/1 and this is 4C2 and so on 
// Calculate value og [n * (n-1) * (n-2) *... (n-k+1)*]
// for(int i = 0;i<k;++i){
//    res *= (n-i);
//    res /= (i+1);
//} Time complexity - O(N) Space Complexity - O(N)
