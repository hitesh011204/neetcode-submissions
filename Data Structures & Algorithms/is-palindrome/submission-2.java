class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            while(!Character.isLetterOrDigit(s.charAt(i)) && i<s.length()-1)
            {
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j)) && j>0)
            {
                j--;
            }
            if(!(i<j))
            {
                return true;
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
