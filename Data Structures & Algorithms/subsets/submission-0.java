class Solution {
    List<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>l=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,l);
        return list;    
    }
    public void solve(int nums[],int i,ArrayList<Integer>l)
    {
        if(i==nums.length)
        {
            list.add(new ArrayList<>(l));
            return;
        }
        
        solve(nums,i+1,l);
        l.add(nums[i]);
        solve(nums,i+1,l);
        l.remove(l.size()-1);
    }
}