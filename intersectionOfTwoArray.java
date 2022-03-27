class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> res = new HashSet<Integer>();
        
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int k: res){
            result[i++] = k;
        }
        return result;
    }
}
