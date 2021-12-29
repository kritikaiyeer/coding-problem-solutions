// Set Matrix Zero
class Solution {
    public void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];
     
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                   for(int k = 0; k < matrix[0].length;k++){
                       if(matrix[i][k] != 0){
                           matrix[i][k] = -10;
                       }
                   }
                    for(int k = 0; k < matrix.length;k++){
                        if(matrix[k][j] != 0){
                           matrix[k][j] = -10;
                       }
                   }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == -10){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

// Time complexity = O(mn) Brute force
