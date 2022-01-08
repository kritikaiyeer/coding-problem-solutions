// Return The nth row of the pascal triangle

class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> res = new ArrayList<>();
        int k = rowIndex;
        int j = 1;
        res.add(0,1);
        for(int i = 0;i < rowIndex; i++){
            long out = (long) res.get(i);
            out *=k; //This is the ncr formula
            out /=j;
            k--;
            j++;
            res.add((int) out);
        }
        return res;
    }
}
