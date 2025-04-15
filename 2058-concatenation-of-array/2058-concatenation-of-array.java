class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[n*2];
        for(int i=0; i<n; i++) {
            newarr[i] = nums[i];
        }

        for(int i=n; i<n*2; i++) {
            newarr[i] = nums[i-n];
        }

        return newarr;
    }
}