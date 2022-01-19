//Brute force
// ask interviewer if the numbers are going to be sorted.
// sort based on intervals
class Solution {
    public int[][] merge(int[][] intervals) {
        // sort the arrays
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        List<int[]> ans  =  new ArrayList<>();
        
        int i = 1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            
            if(s <= end){
                end = Math.max(e,end);
            } else {
                ans.add(new int[]{start,end});
                start = s;
                end = e;
            }
            i++;
        }
        ans.add(new int[] {start,end});

        return ans.toArray(new int[0][]);
    }
}
// [1,8,15]
// [6,10,18]

// 2<3 max = new max = 6
// 8>6 add 8 to min and max = 10
// 15>10 add 15 to min and max = 18
// return new array of each pairs,
// TC: O(NLOGN) O(N2)
// SP: O(N2)
