class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;
        //since arr is rotated and sorted we only need to find sorted halves so any one half first idx will be min
        //aproach pick up sorted half(left,right ) and take low min and eliminate
        while(low <= high){
           int mid = low + (high - low)/2;
           //base condtion this early exist the loop 
           if(nums[low] <= nums[high]){
            return Math.min(min,nums[low]);
           }
           //left sorted
           if(nums[low]<=nums[mid]){
             min = Math.min(nums[low],min);
             //now eliminate the sorted half
             low = mid + 1;
           }
           else if(nums[mid] <= nums[high]){ //we can write else also for understanding i written
            min = Math.min(min,nums[mid]);
            high = mid - 1;
           }
        }
        return min;
    }
}



//approach
// find left sorted half  and get min = low then eliminate low = mid + 1
// find right sorted half  and get min = mid then elimintate high = mid - 1
//for understanding dry run this example nums = [4,5,1,2,3]
