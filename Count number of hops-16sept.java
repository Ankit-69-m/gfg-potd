class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
      if (n==0)  return 1;
      if (n==1)  return 1;
      if (n==2)  return 2;
      
        long a=1, b=1, c=2, ans=0;
        
        for (int i=3; i<=n; i++){
            ans = (a+b+c)%1000000007;
            a=b;
            b=c;
            c=ans;
            
        }
        
        return ans;
    }
    
}