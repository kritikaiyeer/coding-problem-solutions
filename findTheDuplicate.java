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

// optimal linked list cycle
// Linked List cycle method

//Intiution & proof:
// 1. First collision: (when fast meets slow in the cycle) (This will help to find whether cycle exists or not.) 
// fast is just moving twice the speed as slow. slow is moving 1 unit , fast is moving at 2 units. so, fast = 2* slow.  now take some distance n(consider it as a ring road :-p ) 
// To cover distance n , slow needs n units
// fast needs 2n units right (fast =2*slow)
// This mean eventually they are meeting. I hope this makes sense.
// 2. Finding where collision occured (the entry point/duplicate number in this case):
// From (1)-> we already know there is some entry point (where cycle starts) & a meeting point (where fast meets slow).
// lets say distance from starting point to entrypoint = d1;
// distance from entrypoint to meetingpoint = d2;
// distance from meetingpoint to entrypoint (which makes cycle) = d3;
//  slow covers d1 distance and d2 to reach meeting point, so slow = d1+d2;
// fast covers d1,d2 d3 and again d2 to reach meeting point, so fast = d1+d2+d2+d3 = d1+2d2+d3
// from 1, we know fast = 2* slow
// d1+2d2+d3 = 2(d1+d2) which mean ( d1=d3 )
// It concludes distance between d1 (starting & entry) equals d3(meetingpoint to entrypoint), thats the intuition behind starting fast pointer at head for the second time and moving both 1 unit, at equal distance theyll find the duplicate/entrypoint.
class Solution {
    public int findDuplicate(int[] nums) {
      int slow = nums[0];
      int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]]; // move by 2 units
        } while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast]; // move by 1 unit
        }
        return slow;
    }
}

//TC: O(N) SP: O(1)
