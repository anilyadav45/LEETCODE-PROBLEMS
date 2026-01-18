class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int rem = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }
            rem = sum - k; // x - k
            if(map.containsKey(rem)){
                count += map.get(rem)+1; // add what we get when stored that sum
            }
        // to check if exist sum then just incremeent idx if not default 0
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
             if(!map.containsKey(sum)){
                map.put(sum,0);
            }
            
        }
        return count;

    }

}