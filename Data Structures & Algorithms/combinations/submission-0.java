class Solution {
    public List<List<Integer>>list=new ArrayList<>();
    public ArrayList<Integer>l=new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        solve(n,k,1,l);
        return list;
        
    }
    public void solve(int n,int k,int i,ArrayList<Integer> l)
    {
        if(l.size()==k)
        {
            list.add(new ArrayList<>(l));
            return;
        }
        
        if(l.size()>k || i>n)
        {
            return;
        }
        solve(n,k,i+1,l);

        l.add(i);
        solve(n,k,i+1,l);
        l.remove(l.size()-1);
        
    }
}