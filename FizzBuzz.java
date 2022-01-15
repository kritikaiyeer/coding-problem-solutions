class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        Integer i = 1;
        while(i <= n){
            if(i % 3 == 0 && i % 5 == 0){
                result.add(i-1,"FizzBuzz");
            }else if (i % 3 == 0){
                result.add(i-1,"Fizz");
            } else if (i % 5 == 0){
                result.add(i-1,"Buzz");
            } else {
                result.add(i-1,i.toString());
            }
            i++;
        }
        return result;
        
    }
}
