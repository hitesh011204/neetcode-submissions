class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>Tsum=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(Tsum.containsKey(target-nums[i]))
            {
                return new int[]{Tsum.get(target-nums[i]),i};
            }
            Tsum.put(nums[i],i);
        }
        return new int[]{};
    }
}
