class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>seq=new HashSet<>();
        for(int num:nums)
        {
            seq.add(num);
        }
        int result=0;
        for(Integer num:seq)
        {
            if(!seq.contains(num-1))
            {
                int count = 1;
                int curr = num;
            while(seq.contains(curr+1))
            {
                count++;
                curr++;
            }
            result=Math.max(result,count);
        }}
        return result;
    }
}
