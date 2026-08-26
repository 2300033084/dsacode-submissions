class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<operations.length;i++)
        {
            if(!operations[i].equals("+") && !operations[i].equals("D") && !operations[i].equals("C"))
            {
                st.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("+"))
            {
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(operations[i].equals("D"))
            {
                int a=st.peek();
                st.push(a*2);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
        }
        int ans=0;
        while(!st.isEmpty())
        {
            ans=ans+st.pop();
        }
        return ans;
        
    }
}