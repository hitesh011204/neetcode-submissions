class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer>smap=new HashMap<>();
        char[] sarray=s.toCharArray();
        char[] tarray=t.toCharArray();
        for(char c:sarray)
        {
            smap.put(c,smap.getOrDefault(c,0)+1);
        }
        for(char c:tarray)
        {
            if(!smap.containsKey(c) || smap.get(c)==0)
            {
                return false;
            }
            smap.put(c,smap.get(c)-1);
        }
        
        return true;
    }
}
