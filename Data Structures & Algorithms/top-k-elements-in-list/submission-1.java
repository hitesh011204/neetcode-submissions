class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>kfreq=new HashMap<>();
        int[] result=new int[k];
        for(int i:nums)
        {
            kfreq.put(i,kfreq.getOrDefault(i,0)+1);
        }
        while(k>0)
        {
            int maxkey=0;
            int max=0;
            for(Integer key:kfreq.keySet())
            {
                if(kfreq.get(key)>max)
                {
                    max=kfreq.get(key);
                    maxkey=key;
                }
            }
            result[k-1]=maxkey;
            kfreq.remove(maxkey);
            k--;
        }
        return result;
    }
}
