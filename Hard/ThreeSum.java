import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j = i + 1;
        int k = 0;
        int n = nums.length;
        for (i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;//skip other parts
            }
            //if not proceed
            j = i + 1;
            k = n - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {//we got triplets
                    List<Integer> temp = new ArrayList<>();//each time need new lsit to add in ans 
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                //the moment j k cross means assign i here but should be different nums[i] than previoius ith elem
                    while(j<k &&nums[j] == nums[j-1]){
                        j++;//looking for different elem for j idx
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;//looking for diff kth elem for k idx for next round
                    }

                }
                if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }
            }          
        }
        return ans;
    }
}
