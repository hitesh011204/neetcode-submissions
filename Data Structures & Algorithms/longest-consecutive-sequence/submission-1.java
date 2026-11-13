class Solution {
    public int longestConsecutive(int[] nums) {
        int maxm=1,result=0;
        if(nums.length==0)
        {
            return result;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            while(nums[i]==nums[i-1] && i<nums.length-1)
            {
                i++;
            }
            if(nums[i]==nums[i-1]+1)
            {
                maxm++;
            }
            else
            {
                result=Math.max(maxm,result);
                maxm=1;
            }
        }
        result=result=Math.max(maxm,result);
        return result;
    }
}
