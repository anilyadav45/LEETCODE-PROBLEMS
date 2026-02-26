class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        //since it is sorted we'll search for 1st greater elem than target so previous elem automatically wil become the largest smallest 
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]<=x){
                ans = mid;
                //since we got ans but may be more greatest elem which is <=x exist right side so see right side
                low = mid + 1;
            }
            else{//the time we got >x means no need to search right search left we need <=x so see left
            high = mid - 1;
                
            }
        }
        return ans;
    }
}
