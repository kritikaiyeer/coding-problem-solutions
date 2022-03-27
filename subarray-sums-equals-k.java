class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,1);
        int res = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(hm.containsKey(sum-k)){
                res += hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            
        }
        return res;
    }
}
