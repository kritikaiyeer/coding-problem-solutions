// Kadane's Algorithm
// Find the maximum sum of a sub array of given array
// Brute force - O(N3)
// initialize maximum = 0
// three loops -
// 1. first loop 0 - n-1
// 2. second loop 0 - n -1
// 3. third loop i - j 
//     here find sum of array elements from i - j
// store the value if greater than max.
// return the max value

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum+=nums[k];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}

// Above doesnt work for all negative nums.

// Better approach O(N2)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+= nums[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}

// has some problems as well

// Optimal
