class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++) {
            String binary = Integer.toBinaryString(i);
            int countOnes = binary.replace("0","").length();
            arr[i] = countOnes;
        }
        return arr;
    }
}