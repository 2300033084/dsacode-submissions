class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        int p1=0;
        int p2=people.length-1;
        while(p1<=p2)
        {
            if(people[p1]+people[p2]<=limit)
            {
                ans++;
                p2--;
                p1++;
            }
            else{
                ans++;
                p2--;
            }
        }
        return ans;
        
    }
}