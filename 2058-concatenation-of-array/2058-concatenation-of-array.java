class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] con = new int[n+n];
        for(int i=0; i<nums.length; i++) {
            con[i] = nums[i];
            
        }
        for(int i=n; i<con.length; i++) {
            con[i] = nums[i-n];
        }
        return con;
        
    }
   
}