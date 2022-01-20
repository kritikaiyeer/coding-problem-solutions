class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j = 0;
        for(int i = m;i < nums1.length; i++){
            if(n > 0){
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        
    }
}

// Brute force - TC: O(N) + O(NlogN) 
// SP: O(1)

// Optimal sort - Gap algorithm 
// below is some other way
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        m--;
        n--;
        int c = m + n + 1;
        while(m >= 0 && n >= 0){
            //copy the no. which is greater among nums1[m] and nums2[n] to nums1 at index c
            nums1[c--] = nums2[n] > nums1[m] ? nums2[n--] : nums1[m--];
            
        }
        // add remaining elements
        while(n >= 0){
            nums1[c--] = nums2[n--];
        }
    }
}
//TC: O(N)
