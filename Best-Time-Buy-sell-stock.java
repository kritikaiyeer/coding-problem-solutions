import java.util.Arrays;
 
class Solution {
    public int arbit(int[] prices){
        if(prices.length <= 2){
            if(prices.length == 2 && prices[1] > prices[0]){
                return prices[1] - prices[0];
            }
             return 0;
        }
        int m = prices.length/2;
        int[] left = Arrays.copyOfRange(prices, 0, m);
        int[] right = Arrays.copyOfRange(prices, m+1, prices.length);

        int lg = arbit(left);
        int rg = arbit(right);
        int max = IntStream.of(left).max().orElse(Integer.MIN_VALUE);
        int min = IntStream.of(right).min().orElse(Integer.MAX_VALUE);
        return Math.max(Math.max(lg, rg), max-min);
    }
    public int maxProfit(int[] prices) {
        return arbit(prices);
    }
}
