class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = combine(nums1,nums2);
        sort(ans);
        
        int length = ans.length;
        
        if(length%2 == 1){
            return ans[length/2];
        }else{
            int middle = length/2;
            return (ans[middle-1]+ans[middle])/2.0;
        }
    }
    
    int[] combine(int[] arr1,int[] arr2){
        int[] combinedArr = new int[arr1.length+arr2.length];
        
        for(int i = 0;i<arr1.length;i++){
            combinedArr[i] = arr1[i];
        }
        
        for(int i = 0;i<arr2.length;i++){
            combinedArr[arr1.length+i] = arr2[i];
        }
        
        return combinedArr;
        
    }
    
    void sort(int[] arr){
        boolean swapped;
        
        for(int i = 0; i<arr.length;i++){
            swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            
            if(!swapped){
                break;
            }
        }
    }
}