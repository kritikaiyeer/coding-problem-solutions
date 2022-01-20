public class HelloWorld{
    
    public static int merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int count = 0;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i=l;i<n1;i++){
            L[i] = arr[i];
        }
        for(int i=m;i<n2;i++){
            R[i] = arr[i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
                count +=(m + 1) - (l + i);
            }
        }
        while (i < L.length)
            arr[k++] = L[i++];
        while (j < R.length)
            arr[k++] = R[j++];
        return count;
    }
    
    public static int mergesort(int[] arr, int l, int r){
        int count = 0;
        if( l < r){
            int m = l + (r - l)/2;
            count += mergesort(arr,l,m);
            count += mergesort(arr,m+1,r);
            count += merge(arr,l,m,r);
        }
        return count;
    }

     public static void main(String []args){
         int[] arr = new int[]{5,3,2,4,1};
         System.out.println(mergesort(arr,0,arr.length - 1));
     }
}
