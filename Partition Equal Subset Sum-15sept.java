class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum =0;
        for( int x : arr){
            sum = sum +x;
        }
        
        if (sum%2==1)
        return 0;
        
        sum = sum/2;
        
        int ar[][] = new int[N+1][sum+1];
        
        for (int i=0; i<=N; i++){
            ar[i][0] = 1;
        }
        
        for(int i=1; i<=N; i++){
            for(int j=0; j<=sum; j++){
                if(arr[i-1]<=j)
                
                ar[i][j] = ar[i-1][j] + ar[i-1][j-arr[i-1]];
                
                else 
                
                ar[i][j] = ar[i-1][j];
            }
        }
        
        if (ar[N][sum]==0)
        return 0;
        return 1;
    }
}
