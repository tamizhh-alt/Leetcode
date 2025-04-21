class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int sum = 0;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i=1; i<n; i++) {
            sum += nums[i-1];
            leftSum[i] = sum;
        }
        sum = 0;
        

        for(int i=n-2; i>=0; i--) {
            sum += nums[i+1];
            rightSum[i] = sum;
        }

        for(int i=0; i<n; i++){
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }
}