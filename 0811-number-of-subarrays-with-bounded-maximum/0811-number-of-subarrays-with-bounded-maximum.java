class Solution 
{
    public int numSubarrayBoundedMax(int[] nums, int left, int right) 
    {
        int start =-1;
        int end =-1;
        int result =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                start =i;
                end=i;
                continue;
            }
            if(nums[i]>=left){
                end=i;
            }
            result+= end-start;
        }
        return result;
    }
}