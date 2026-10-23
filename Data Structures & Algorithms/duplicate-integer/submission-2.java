class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>Duplicate=new HashSet<>();
        for(int i:nums)
        {
            if(!Duplicate.add(i))
            {
                return true;
            }
        }
        return false;
    }
}