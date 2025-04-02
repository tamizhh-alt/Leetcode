class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> list = new ArrayList<>();

        for(int i=0; i<len; i++) {
            int start = nums[i];
            boolean b = false;
            
            while(i<len-1 && nums[i]+1 == nums[i+1]) {
                b = true;
                i++;
            }
            if(b) {
                list.add(start + "->" + nums[i]);

            }
            else {
                list.add(String.valueOf(start));
            }
        }
        return list;
    }
}