class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > nums.length/3){
                result.add(e.getKey());
            }
        }
        return result;
    }
}

// TC: O(NLOGN)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == num1){
                c1++;
            }else if(nums[i] == num2){
                c2++;
            }else if(c1 == 0){
                num1 = nums[i];
                c1 =1;
            } else if(c2 == 0){
                num2 = nums[i];
                c2 = 1;
            } else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == num1){
                c1++;
            }
            if(nums[i] == num2){
                c2++;
            }
        }
        if(c1 > nums.length/3){
            result.add(num1);
        }
        if(c2 > nums.length/3){
           if(num1 != num2){
               result.add(num2);
           }
        }
        
        return result;
    }
}

// TC: O(N) + O(N) SP: O(1)
