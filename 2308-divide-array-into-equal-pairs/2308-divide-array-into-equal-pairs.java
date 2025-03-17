class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        if(nums.length%2==1) return false;

        int count = 0;
        int n = nums.length/2;
        for(int i=0; i<nums.length; i=i+2){
           if(nums[i]==nums[i+1]) {
            count++;
           }
        }
        if(n==count) return true;
        return false;
    }
}