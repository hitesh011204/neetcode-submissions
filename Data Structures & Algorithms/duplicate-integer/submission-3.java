class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> containsDuplicate=new HashSet<>();
        for(int i:nums)
        {
            if(!containsDuplicate.add(i))
            {
                return true;
            }
        }
        return false;
    }
}