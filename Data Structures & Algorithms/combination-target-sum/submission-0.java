class Solution {
    List<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>l=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] c, int target) {
        //int sum=0;
        solve(c,target,0,0,l);
        return list;
    }
    public void solve(int c[],int target,int i,int sum,ArrayList<Integer>l)
    {
        if(sum>target)
        {
            return;
        }
        if(i==c.length)
        {
            if(sum==target)
            {
                list.add(new ArrayList<>(l));
            }
            return;
        }
        
        solve(c,target,i+1,sum,l);

        l.add(c[i]);
        solve(c,target,i,sum+c[i],l);
        l.remove(l.size()-1);
    }
}