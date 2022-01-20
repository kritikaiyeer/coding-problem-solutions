// here i have modified the array you are not supposed to do that
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dupe = 0;
        for(int i = 1;i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                dupe = nums[i];
            }
        }
        return dupe;
    }
}
