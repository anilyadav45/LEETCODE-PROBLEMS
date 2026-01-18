//this is for only +ve elems for -ve and +ve we only have soln with prefix sum with hashmap
class Solution {
    public int longestSubarray(int[] nums, int k) {
       int len = 0;
       int sum = 0;
       int left = 0;
       int right = 0;
       while(right<nums.length){
        sum += nums[right];
        if(sum == k){
            len = Math.max(len,right-left+1);
        }
        if(sum > k){
            sum = sum - nums[left];
            left++;
        }
        right++;
       }
       return len;
    }
}