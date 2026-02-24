class Solution {
    int upperBound(int[] arr, int target) {
        // code here
       //same with linear search it is easy but we must apply binsearch
       int low = 0;
       int high = arr.length - 1;
       int ans = arr.length;
       while(low<=high){
           int mid = (low + high) / 2;
           if(arr[mid] > target){ //this might be ans but not confirmed so see left
           
            ans = mid;
            high = mid - 1;
           }
           else if(arr[mid] <= target){//means search right side
           low = mid + 1;
               
           }
       }
       return ans;
    }
}
