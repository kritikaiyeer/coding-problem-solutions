class Solution 
{
    public int solution(int N) 
    {
        int max = 0;
        int counter =0;
        boolean start = false;
        String binaryN = Integer.toBinaryString(N);
        
        for(int i =0;i<binaryN.length();i++){
            String op = binaryN.substring(i,i+1);
            if(op.equals("1")){
                if(start){
                    if(counter > max){
                        max = counter;
                    }
                }
                counter = 0;
                start = true;
            }
            if(op.equals("0")){
                counter++;
            }
        } 
        return max; 
    }
        
}

