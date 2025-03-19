class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> S = new HashSet<>();
        int start = 0;
        int max = 0;
        for(int end = 0; end<s.length(); end++){
            while(S.contains(s.charAt(end))) {
                S.remove(s.charAt(start)) ;
                start++;
            }
            S.add(s.charAt(end));
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}