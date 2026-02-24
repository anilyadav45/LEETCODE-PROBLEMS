class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        //we have to find the smallest idx where we got elem which is greater than and equal to target
    //brute force - linear very easy but we need to use binsearch
    int l = 0;
    int r = arr.length - 1;
    int ans = arr.length;
    while(l<=r){
        int mid = (l+r)/2;
        if(arr[mid] >= target){
            ans = mid;
            r = mid - 1;//til now we got condition & ans but not know it is smallest idx so for smaller we see left
        }
        else if(arr[mid] < target){
            l = mid + 1;
        }
        
    }
 
    
        return ans;
    }
}
