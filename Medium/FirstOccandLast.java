class Solution {
    private static int lowerBound(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= t) {
                ans = mid;
                //may be more lowest idx lower bound exist 
                //since we want lowest idx which satisfy >=t
                high = mid - 1;
            } else {//see right for >=t if it is <t
                low = mid + 1;

            }
        }
        return ans;
    }

    private  static int upperBound(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > t) {
                ans = mid;
                //may be more exist with lowest idx which satisfy >t 
                high = mid - 1;

            } else {//if we got <=t means we have to check right
                low = mid + 1;

            }
        }
        return ans;
    }
    

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target){
            return new int[]{0,0};
        }
        //here linear search will take O(n) so we gonna apply binsearch lower and upper bound
        int low = 0;
        int high = nums.length - 1;
        int first = lowerBound(nums,target);
        if(first == nums.length  || nums[first] != target){
            return new int[]{-1,-1};
        }
        int last = upperBound(nums,target);

        return new int[] { first, last - 1 };
    }
}
