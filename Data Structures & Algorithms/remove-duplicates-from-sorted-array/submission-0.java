class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[k-1] == nums[i])
            {
                continue;
            }
            else{
                nums[k++]=nums[i];
            }
        }
        return k;
        
    }
}