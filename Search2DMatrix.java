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

// Time Complexity - O(N*logn) 
