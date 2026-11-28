class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>LS=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int max=0;
            int j=i;
            while(j<s.length())
            {
                if(!LS.add(s.charAt(j)))
                {
                    break;
                }
                max++;
                j++;
            }
            LS.clear();
            count=Math.max(count,max);
        }
        return count;
    }
}
