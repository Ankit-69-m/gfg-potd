class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = n - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                first = mid;
                right = mid - 1; 
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        left = 0;
        right = n - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                last = mid;
                left = mid + 1; 
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (first == -1 || last == -1) {
            result.add(-1);
            result.add(-1);
        } else {
            result.add(first);
            result.add(last);
        }

        return result;

    }
}