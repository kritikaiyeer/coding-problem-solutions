class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(i>= 0 || j >= 0 || carry > 0){
            int val1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int val2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int val = val1 + val2 + carry;
            carry = val/10;
            res.insert(0,val%10);
        }
        return res + "";
    }
}
