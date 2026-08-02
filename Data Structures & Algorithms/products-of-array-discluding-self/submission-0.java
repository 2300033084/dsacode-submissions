class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        int x=1;
        for(int i=0;i<nums.length;i++)
        {
            pre[i]=x;
            x=x*nums[i];
        }
        x=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            suf[i]=x;
            x=x*nums[i];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=suf[i]*pre[i];
        }
        return ans;
        
    }
}