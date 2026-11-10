class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>TS=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(TS.containsKey(target-nums[i]))
            {
                return new int[]{TS.get(target-nums[i]),i};
            }
            TS.put(nums[i],i);
        }
        return new int[]{};
    }
}
