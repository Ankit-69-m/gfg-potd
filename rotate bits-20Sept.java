class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
     ArrayList<Integer> result = new ArrayList<>();

        D %= 16;
        
        int leftRotated = ((N << D) | (N >> (16 - D))) & 0xFFFF;
        result.add(leftRotated);

        int rightRotated = ((N >> D) | (N << (16 - D))) & 0xFFFF;
        result.add(rightRotated);

        return result;
    }
}