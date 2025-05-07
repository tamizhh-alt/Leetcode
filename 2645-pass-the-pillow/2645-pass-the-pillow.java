class Solution {
    public int passThePillow(int n, int time) {
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) { 
            arr[i] = i + 1;
        }

        int cycle = time / (n - 1);       
        int index = time % (n - 1);       

        if (cycle % 2 == 0) {
            return arr[index];           
        } else {
            return arr[n - 1 - index];   
        }
    }
}
