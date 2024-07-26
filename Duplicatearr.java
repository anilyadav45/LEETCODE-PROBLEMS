class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] != nums[i]) {
                nums[k] = nums[i+1];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = { 1, 1, 2 };
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("k = " + k1); // Should print 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " "); // Should print 1 2
        }
        System.out.println(); // For visual separation in output

        // Example 2
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("k = " + k2); // Should print 5
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " "); // Should print 0 1 2 3 4
        }
        System.out.println(); // For visual separation in output
    }
}
