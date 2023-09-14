class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    int ar[][] = new int[n+1][sum+1];
	    
	    for (int i=0; i<=n; i++){
	        ar[i][0] = 1;
	    }
	    
	    for (int i=1; i<=n; i++){
	        for(int j=0; j<=sum; j++){
	            if(arr[i-1]<=j)
	            ar[i][j] = (ar[i-1][j] + ar[i-1][j-arr[i-1]])%1000000007;
	            
	            else 
	            ar[i][j] = ar[i-1][j];
	        }
	    }
	    
	    return ar[n][sum];
	    
	} 
}