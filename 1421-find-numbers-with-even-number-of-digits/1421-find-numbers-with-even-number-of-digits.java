class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] str = new int[n];
        for(int i=0; i<n; i++) {
            str[i] = String.valueOf(Math.abs(nums[i])).length();
        }
        for(int i=0; i<str.length; i++){
            if(str[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}