class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int win = 0;
        int max = 0;
        int n = nums.length;

        for(int i=0; i<k; i++){
            win += nums[i];
        }
        max = win;

        for(int i=k; i<n; i++) {
            win += nums[i];
            win -= nums[i-k];
            max = Math.max(max,win);
        }
        return (double) max/k;
    }
}