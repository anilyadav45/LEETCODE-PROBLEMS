//better 
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();//store key and idx since arr don't have duplicates that's why we are using it 
       int needed = 0;
       for(int i=0; i<nums.length; i++){
        needed = target - nums[i] ;
        if(map.containsKey(needed)){
            return new int[]{map.get(needed) , i};
        }
        else{
            map.put(nums[i] , i);
        }
         
       }
       return new int[]{};

    }
}