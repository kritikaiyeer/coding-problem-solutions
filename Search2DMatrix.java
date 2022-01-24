class Solution {
    public int binarySearch(int arr[], int l,int r, int t){
        if(r>=l){
            int mid = l + (r - l)/2;
            if(arr[mid] == t){
                return mid;
            } if(arr[mid] > t){
                return binarySearch(arr,l,mid-1,t);
            }
            return binarySearch(arr,mid+1,r,t);
        }
        return -1;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; ){
            if(binarySearch(matrix[i],0,matrix[i].length-1,target) == -1){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}

// Time Complexity - O(N*logm) 

class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length -1;
        while(j>= 0 && i < matrix.length ){
            if(target == matrix[i][j]){
                return true;
            }else if(target < matrix[i][j]){
                j--;
            } else if(target > matrix[i][j]){
                i++;
            }
        }
        return false;
    }
}

// Time complexity - 0(N)

class Solution {
    public int binarySearch(int arr[][], int l,int r, int t){
        if(r>=l){
            int mid = l + (r - l)/2;
            int row = mid/arr[0].length;
            int col = mid % arr[0].length;
            if(arr[row][col] == t){
                return 1;
            } if(arr[row][col] > t){
                return binarySearch(arr,l,mid-1,t);
            }
            return binarySearch(arr,mid+1,r,t);
        }
        return -1;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = (matrix.length*matrix[0].length) - 1;
       if(binarySearch(matrix,0,n,target) == 1){
           return true;
       }
        return false;
    }
}
// Time complexity O(lognm)
