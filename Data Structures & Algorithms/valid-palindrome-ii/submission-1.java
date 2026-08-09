class Solution {
    public boolean check(String s, int p1,int p2)
    {
        while(p1<=p2)
        {
            if(s.charAt(p1)==s.charAt(p2))
            {
                p1++;
                p2--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int p1=0;
        int p2=s.length()-1;
        int flag=0;
        while(p1<=p2)
        {
            if((s.charAt(p1) != s.charAt(p2)) && flag==0)
            {
                flag=1;
                return check(s,p1,p2-1) || check(s,p1+1,p2);
            }
            p1++;
            p2--;

        }
        return true;
        
    }
}