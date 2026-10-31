class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        Arrays.fill(output,0);
        int tproduct=1, zerocount=0;
        for(int i:nums)
        {
            if(i==0)
            {
                zerocount++;
                continue;
            }
            tproduct*=i;
        }
        for(int i=0;i<output.length;i++)
        {
            if(zerocount==0)
            {
                output[i]=tproduct/nums[i];
            }
            else if(zerocount==1)
            {
                if(nums[i]==0)
                {
                    output[i]=tproduct;
                }
            }
            else
            {
                return output;
            }
        }
        return output;
    }
}  
