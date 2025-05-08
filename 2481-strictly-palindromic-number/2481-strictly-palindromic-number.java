class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder SB = sb.reverse();
        
        if(sb.equals(SB)){
            return false;
        } else {
            return true;
        }
    }
}