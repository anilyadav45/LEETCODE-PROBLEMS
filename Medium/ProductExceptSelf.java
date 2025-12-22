//brute force   --  for each i left right and O(n2)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int ans[] = new int[nums.length];
//         int lprod = 1;
//         int rprod = 1;
//         for (int i = 0; i < nums.length; i++) {
//             //reset for next step
//             lprod = 1;
//             rprod = 1;
//             //for left
//             if (i != 0) {

//                 for (int j = 0; j <= i-1; j++) {
//                     lprod *= nums[j];
//                 }
//             }
//             //for right 
//             for (int k = i + 1; k < nums.length; k++) {
//                 rprod *= nums[k];
//             }
//             ans[i] = lprod * rprod;
//         }
//         return ans;

//     }
// }

//optimal - prefix suffix 
//with storing prefix and suffix arrays then ans 
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int suffix[] = new int[nums.length];
//         int prefix[] = new int[nums.length];

//         //prefix - left -> at 0 there is no left el thats why keep 1
//         prefix[0] = 1;
//         for (int i = 1; i < nums.length; i++) {
//             prefix[i] = prefix[i - 1] * nums[i-1];//from 0th idx to calc prefix
//         }
//         //suffix - right -> left i.e from n-1th idx to calc suffix
//         suffix[nums.length-1] = 1;
//         for (int i = nums.length - 2; i >= 0; i--) {
//             suffix[i] = suffix[i + 1] * nums[i+1];
//         }
//         //for ans
//         int ans[] = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             ans[i] = prefix[i] * suffix[i];
//         }
//         return ans;

//     }
// }

//without using extra space
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: prefix product
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: suffix product
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}
