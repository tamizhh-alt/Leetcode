class Solution {
    public boolean squareIsWhite(String c) {
        return ((c.charAt(0) - 'a')+ (c.charAt(1)-'0')) %2 == 0;
    }
}