class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> GAnag=new HashMap<>();
        for(String S:strs)
        {
            char[] charstrs=S.toCharArray();
            Arrays.sort(charstrs);
            String Sorted=new String(charstrs);
            if(!GAnag.containsKey(Sorted))
            {
                GAnag.put(Sorted,new ArrayList<>());
            }
            GAnag.get(Sorted).add(S);
        }
        return new ArrayList<>(GAnag.values());
    }
}
