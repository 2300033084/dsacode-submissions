class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int x=0;
        int idx=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                x=nums[i];
                idx=i;
                break;
            }
        }
        
        if(x !=1)
        {
            return 1;
        }
        for(int i= idx+1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            if(nums[i] !=nums[i-1]+1)
            {
                //System.out.println("n");
                return nums[i-1]+1;
            }
        }
        
        return nums[n-1]+1;
        
    }
}