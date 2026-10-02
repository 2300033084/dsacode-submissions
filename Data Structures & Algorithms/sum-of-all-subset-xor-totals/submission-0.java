class Solution {
    int ans=0;
    public int subsetXORSum(int[] nums) {
        
        solve(nums,0,0);
        return ans;
    }
    public void solve(int nums[] , int i,int xor)
    {
        if(i==nums.length)
        {
            ans=ans+xor;
            return ;
        }
        solve(nums,i+1,xor^nums[i]);
        solve(nums,i+1,xor);

        
    }
}