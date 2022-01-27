class Solution {
    public int majorityElement(int[] nums) {
        /// moore's voting algorithm
        int count = 1;
        int element = nums[0];
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                element = nums[i];
            }
            if(element == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}

// TC: O(N) 

// can use hashmap will be O(NLOGN)
