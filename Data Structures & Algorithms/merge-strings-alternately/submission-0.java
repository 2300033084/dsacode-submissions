class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int p1=0;
        int p2=0;
        int n=word1.length();
        int m=word2.length();
        // int len;
        // String large;
        // if(m>n)
        // {
        //     len=m;
        //     large=word2;
        // }
        // else{
        //     len=n;
        //     large=word1;
        // }
        while(p1<n && p2<m)
        {
            sb.append(word1.charAt(p1));
            sb.append(word2.charAt(p2));
            //if(p1 <n-1 && p2 <m-1)
            //{
                p1++;
                p2++;
            //}
            
        }
        // if(!large.isEmpty())
        // {
        //     for(int i=len;i<)
        // }
        if(p1 <= n-1)
        {
            while(p1<n)
            {
                sb.append(word1.charAt(p1));
                p1++;
            }
        }
        if(p2 <= m-1)
        {
            while(p2<m)
            {
                sb.append(word2.charAt(p2));
                p2++;
            }
        }
        return sb.toString();
    }
}