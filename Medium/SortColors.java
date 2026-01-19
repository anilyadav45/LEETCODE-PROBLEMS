//better 
class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0++;
            }
            if (nums[i] == 1) {
                c1++;
            }
            if (nums[i] == 2) {
                c2++;
            }
        }

        //to copy in nums
        // 0 to c0 to c1 to c2 len to copy 
        int idx = 0;//to track nums to copuy
        for (int i = 0; i < c0; i++) {
            nums[idx] = 0;
            idx++;
        }
        for (int i = 0; i < c1; i++) {
            
            nums[idx] = 1;
            idx++;
        }
        for (int i = 0; i < c2; i++) {
          
            nums[idx] = 2;
            idx++;
        }
    }
}