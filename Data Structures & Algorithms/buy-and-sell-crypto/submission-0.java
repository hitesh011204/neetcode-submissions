class Solution {
    public int maxProfit(int[] prices) {
        int result=0;
        int i=0;
        int n=prices.length;
        while(i<n-1)
        {
            int j=i+1;
            while(j<n)
            {
                if(prices[i]>prices[j])
                {
                    j++;
                }
                else
                {
                    result=Math.max(result,prices[j]-prices[i]);
                    j++;
                }
            }
            i++;
        }
        return result;
    }
}
