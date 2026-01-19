class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int mxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            mxsum = Math.max(sum,mxsum);
          if(sum < 0){
            sum = 0; //reset 
          }
        }
        return mxsum;
    }
}