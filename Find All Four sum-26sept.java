Arrays.sort(arr);
        int n = arr.length;
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int s = j+1, e = n-1;
                
                while (s<e){
                    int sum = arr[i] + arr[j] + arr[s] + arr[e];
                    if(sum==k){
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[s], arr[e]));
                        
                        if(!hs.contains(l)){
                            list.add(l);
                            hs.add(l);
                        }
                        
                        s++; 
                        e--;
                    }
                    
                    else if(sum<k) s++;
                    else e--;
                }
            }
        }
        
        return list;