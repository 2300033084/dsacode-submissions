class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int n=nums.length;
        //int pre[]=new int[n];
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            int req=sum-k;
            if(hm.containsKey(req))
            {
                ans=ans+hm.get(req);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}