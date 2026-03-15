
import java.util.*;
class Solution {
    private int sumofDivision(int[] arr, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] + mid - 1) / mid;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int sum = 0;
        int divisor = 0;
        int ans = -1;
        Arrays.sort(nums);
        int high = nums[nums.length - 1];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumofDivision(nums,mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
}