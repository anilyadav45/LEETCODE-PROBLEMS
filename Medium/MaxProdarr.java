class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = 0;
        int pref = 1;
        int suff = 1;
        //this prefix and suffix matter when there is odd -ve elemnts 
        for (int i = 0; i < nums.length; i++) {
            //when we got suff or preff as 0 turn it into 1's
            if (pref == 0)
                pref = 1;
            if (suff == 0)
                suff = 1;
            //this is for making restarting count the both suff and pref if we got zeros
            pref = pref * nums[i];//from starting
            suff = suff * nums[nums.length - 1 - i];//from last
            max = Math.max(max, Math.max(pref, suff));
        }

        return max;
    }
}