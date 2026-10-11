class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return cost[0];
        }
        if(n==2)
        {
            return Math.min(cost[0],cost[1]);
        }
        int a=0;
        int b=0;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            c=Math.min(b+cost[i-1],a+cost[i-2]);
            a=b;
            b=c;
        }
        return c;
    }
}