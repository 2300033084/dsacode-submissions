class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer>st=new ArrayDeque<>();
        
        
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("D"))
            {
                st.push(st.peek()*2);
            }
            else if(operations[i].equals("C"))
            {
                st.pop();
            }
            else if(operations[i].equals("+"))
            {
                int sum=0;
                int temp=st.peek();
                st.pop();
                sum=temp+st.peek();
                st.push(temp);
                st.push(sum); 
            }
            else{
                int x=Integer.parseInt(operations[i]);
                st.push(x);
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