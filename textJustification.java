class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        int n = words.length;
        int i = 0;
        while(i< n){
          int j = i + 1;
          int linelength = words[i].length();
          while(j < n && (linelength + words[j].length() + (j-i-1) < maxWidth)){
              linelength += words[j].length();
              j++;
          }
          int diff = maxWidth - linelength;
          int numberofwords = j - i;
          if(numberofwords == 1 || j >=n){
              res.add(leftJustify(words,diff,i,j));
          } else{
              res.add(middleJustify(words,diff,i,j));
          }
          i = j;
        }
        return res;
    }
    
    public String leftJustify(String[] words,int diff,int i,int j){
        int spacesonright = diff - (j - i - 1);
        StringBuilder result = new StringBuilder(words[i]);
        for(int k =i+1;k<j;k++){
            result.append(" " + words[k]);
        }
        result.append(" ".repeat(spacesonright));
        return result.toString();
    }
    public String middleJustify(String[] words,int diff,int i,int j){
        int spacesNeeded = j - i - 1;
        int spaces = diff/spacesNeeded;
        int extraspaces = diff % spacesNeeded;
        StringBuilder result = new StringBuilder(words[i]);
        for(int k =i+1;k<j;k++){
            int spacestoapply = spaces + (extraspaces-- > 0 ? 1 : 0);
            result.append(" ".repeat(spacestoapply) + words[k]);
        }
        return result.toString();
    }
}
