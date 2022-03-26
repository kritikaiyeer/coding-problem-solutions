class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<Character>();
        for(Character c: s.toCharArray()){
            if(c =='(' || c == '[' || c == '{'){
                temp.push(c);
            }else if (c == ')'){
                if(!temp.isEmpty() && temp.peek() == '('){
                    temp.pop();
                }else{
                    return false;
                }
            }else if (c == ']'){
                if(!temp.isEmpty() && temp.peek() == '['){
                    temp.pop();
                }else{
                    return false;
                }
            }else if (c == '}'){
                if(!temp.isEmpty() && temp.peek() == '{'){
                    temp.pop();
                }else{
                    return false;
                }
            }
        }
        return temp.isEmpty();
    }
}
