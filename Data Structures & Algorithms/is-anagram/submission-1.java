class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer>smap=new HashMap<>();
        Map<Character,Integer>tmap=new HashMap<>();
        char[] sarray=s.toCharArray();
        char[] tarray=t.toCharArray();
        for(char c:sarray)
        {
            smap.put(c,smap.getOrDefault(c,0)+1);
        }
        for(char c:tarray)
        {
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        if(smap.size()!=tmap.size())
        {
            return false;
        }
        for(Character key:smap.keySet())
        {
            if((tmap.getOrDefault(key,0).equals(smap.getOrDefault(key,0))))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
