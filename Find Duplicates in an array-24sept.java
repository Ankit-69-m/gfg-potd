class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        int ar[] = new int [n];
        
        for (int i=0; i<n; i++){
            ar[arr[i]] += 1;
        }
        
        for(int i=0; i<n; i++){
            if(ar[i]>1)
            
            list.add(i);
            
        }
        
        if(list.size()==0)
        
        list.add(-1);
        
        return list;
    }
}