// https://leetcode.com/problems/sort-colors/
// brute force solution
class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

//Runtime - 1ms
//Time complexity - O(N2)
//Sorting using Quicksort - O(NlogN)
//Space complexity - inplace O(1)

// You can optimize the above solution using counting sort. Counting sort implementation is below.

// better solution

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two= 0;
        for(int i = 0; i < nums.length;i++){
            switch(nums[i]){
                case 0: zero++;break;
                case 1: one++;break;
                case 2: two++;break;
            }
        }
        
        int k = 0;
        for(int i = 0; i < zero;i++){
            nums[k] = 0;
            k++;
        }
        for(int i = 0; i < one;i++){
            nums[k] = 1;
            k++;
        }
        for(int i = 0; i < two;i++){
            nums[k] = 2;
            k++;
        }
        
    }
}

Runtime - 0ms.
// Time complexity - O(N) for first counting and O(N) for filling numbers . Which means TC = O(2N)

// best solution using variation of the algorithm Dutch National Flag. Use three pointers low, mid and high.
// elements left of low will be 0, elements right of high will be 2.

// The algorithm states:
// Initialize low = 0 mid = 0 and high = nums.length -1.
// Iterate the whole length of array: mid <= high.
// 1. If mid = 0 :
//     swap low and mid. 
//     low++ and mid ++
// 2. If mid = 1:
//       just do mid ++;
// 3. Id mid = 2:
//       swap mid and high
//       high -- ;

class Solution {
    
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        
        while(mid <= high){
            switch(nums[mid]){
                case 0: swap(nums, low, mid);
                        low++;
                        mid++;
                        break;
                case 1: mid++;
                        break;
                case 2: swap(nums, mid, high);
                        high--;
                        break;
            }
        }
        
    }
}

// Time complexity - O(N) single pass
// Space Complexity - O(1)
