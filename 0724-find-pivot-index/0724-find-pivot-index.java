class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left[]= new int[n];
        int right[] =new int[n];
        int sum =0;
        for(int i=0;i<n;i++) {
            sum=sum+nums[i];

        }
        int l=0;
        for(int i=0;i<n;i++){
            left[i] = l;
            l+=nums[i];
        }
        for(int i=0;i<n;i++){
            sum = sum-nums[i];//26
            right[i] = sum;
        }
        for(int i=0;i<n;i++) if(left[i]==right[i]) return i;
        return -1;
    }
}