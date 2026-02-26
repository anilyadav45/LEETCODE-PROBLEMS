// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
//we got ans here but we need smallest no or idx which is >=x
//so already got >=x but need more smaller go for left side if there will get if not no matter
            ans = mid;
            high = mid - 1;
            }
            else{//if >= didn't found means check right side for greater 
            low = mid + 1;
                
            }
        }
        return ans;
    }
}
