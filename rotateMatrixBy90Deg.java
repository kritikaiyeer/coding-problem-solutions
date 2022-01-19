class Solution {
    public void reverse(int[] arr){
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    
    public void rotate(int[][] matrix) {
        // basically find transpose of the matrix
        // then reverse each row
        // how to find transpose loop for ever row and then j from 0 to the row.
        for(int i = 0; i< matrix.length;i++){
           for(int j = 0; j < i;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
               
           }
        }
        
        for(int i = 0; i< matrix.length;i++){
           int[] arr = matrix[i];
            reverse(arr);
        }
    }
}

// this is the optimal solution TC: O(N2) SP: O(1)

// the brute force approach is to add the row col as col in another matrix.
