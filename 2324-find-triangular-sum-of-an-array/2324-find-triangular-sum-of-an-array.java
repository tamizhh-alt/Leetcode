class Solution {
    public int triangularSum(int[] nums) {
        int l = nums.length;
        while(l>1){
            int[] arr = new int[l-1];
            for(int i=0; i<nums.length-1; i++) {
                arr[i] = (nums[i] + nums[i+1]) % 10;
            }
            nums=arr;
            l--;
        }
        return nums[0];

    }
}