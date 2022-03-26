class Solution {
    public int[] frequencySort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i< nums.length;i++){
            res.add(nums[i]);
        }
        sortByFreq(res);
        for(int i=0;i<res.size();i++){
            nums[i] = res.get(i);
        }
        return nums;
    }
    
    public void sortByFreq(List<Integer> res){
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0;i<res.size();i++){
            hm.put(res.get(i), hm.getOrDefault(res.get(i),0)+1);
        }
        Collections.sort(res, (n1,n2)->{
            int f1 = hm.get(n1);
            int f2 = hm.get(n2);
            if(f1 != f2){
                return f1 - f2;
            }
            return n1 - n2;
        });
    }
}
