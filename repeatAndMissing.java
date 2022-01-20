public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int xor1 = A[0];
         int x = 0;
         int y = 0;
        int set_bit;
        for(int i=1;i<A.length;i++){
            xor1 = xor1 ^ A[i];
        }
        for(int i=1;i<=A.length;i++){
            xor1 = xor1 ^ i;
        }
        set_bit = xor1 & ~(xor1 - 1);
        
        for(int i = 0; i< A.length;i++){
            if((A[i] & set_bit) != 0){
                x = x ^ A[i];
            }else{
                y = y ^ A[i];
            }
        }
        for(int i = 1; i<= A.length;i++){
            if((i & set_bit) != 0){
                x = x ^ i;
            }else{
                y = y ^ i;
            }
        }
        return new int[]{x,y};
    }

}
