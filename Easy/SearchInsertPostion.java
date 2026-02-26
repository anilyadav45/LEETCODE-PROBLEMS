class Solution {
    public int searchInsert(int[] nums, int target) {
        //let's apply bin search lower bound
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;//when all elms in arr are smaller than target means next idx will be expected isert idx
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (nums[mid] >= target) { //when we got our ans but don't know it is smallest idx since we got may be left side can be more ans so see left 
                ans = mid;
                high = mid - 1;
            } 
            else {//if not means lesser arr coming than target so see right bcz right always greater in sorted arr
                low = mid + 1;
            }
        }return ans;
}}