class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer>Smap=new HashMap<>();
        char[] sarray=s.toCharArray();
        char[] tarray=t.toCharArray();
        for(char c:sarray)
        {
            Smap.put(c,Smap.getOrDefault(c,0)+1);
        }
        for(char c:tarray)
        {
            if(!Smap.containsKey(c) || Smap.get(c)==0)
            {
                return false;
            }
            Smap.put(c,Smap.get(c)-1);
        }
        return true;
    }
}
