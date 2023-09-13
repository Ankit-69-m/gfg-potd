class Solution{
    static String findLargest(int n, int s){
        if( s>9*n || (n!=1 && s==0))// code here
        return "-1";
        
        int a = s/9;
        int b = s%9;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<a; i++){
            sb.append(9);
        }
        
        if(a<n){
            sb.append(b);
            for (int i=0; i<n-a-1; i++){
                sb.append(0);
            }
        }
        
        return sb.toString();
    }
}