// Set Matrix Zero
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
     
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

// Time complexity = O((N*M)*(N + M)). O(N*M) Brute force Space Complexity - O(1)

class Solution {
    public void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];
     
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                   row[i] = -1;
                   col[j] = -1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i] == -1 || col[j] == -1){
                   matrix[i][j] = 0;
                }
            }
        }
        
    }
}

// Time complexity O(N*M + N*M) Space Complexity O(N) + O(M) - Better

class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1,rows = matrix.length, cols = matrix[0].length; 
        
        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1;j<cols;j++)
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        
        for(int i = rows-1; i>=0;i--){
            for(int j = cols-1;j>=1;j--)
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if(col0 == 0) matrix[i][0] = 0;
            
        }
    }
}

// Time complexity O(NM) Space Complexity O(1)
