class Solution {
    public int subarraySum(int[] nums, int k) {
      int count = 0;
      int sum = 0;
      int rem = 0;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++){
        sum += nums[i];
        if(sum == k){ // when curr sb arr got matched
            count++;
        }
        //if not got matched either it would be greater or smaller lets put into map after seeing already exist or not if exist get that idx and sum of to count i.e reverse engineering
         rem = sum - k;
         if(map.containsKey(rem)){
            count += map.get(rem);
         }

         //if not contains sum put sum and their last idx
         if(!map.containsKey(sum)){
            map.put(sum,0);
         }
         if(map.containsKey(sum)){
            map.put(sum,map.get(sum)+1);
         }
      }
      return count;
    }

}