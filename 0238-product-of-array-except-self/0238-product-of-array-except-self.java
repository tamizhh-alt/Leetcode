class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int totalproduct = 1;

        int zc = 0;
        for(int i=0; i<n; i++){
           if(nums[i]!=0){
            totalproduct *= nums[i];
           } else {
            zc++;
           }
            
        }
        int[] result = new int[n];
        if(zc > 1) return result;
        
        
        for(int i=0; i<n; i++) {
            if(zc==1)
            result[i] = (nums[i]==0) ? totalproduct : 0;
         else {
            result[i] = totalproduct / nums[i];
        }
        }
        return result;
    }
}