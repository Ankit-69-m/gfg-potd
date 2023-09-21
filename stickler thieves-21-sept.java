class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int right = arr[0];
        int left = 0;
        int max = right;
        
        for(int i=1; i<n; i++){
            max = Math.max(right , left+arr[i]);
            left = right;
            right = max;
        }
        
        return max;
    }
}