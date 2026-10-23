class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length-1)
        {
            int j=i+1;
            while(j<nums.length)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
        }
    }
    