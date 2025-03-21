class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int j = 0;

        if(sArray.length == 0) return true;

        for(int i = 0; i < tArray.length; i++) {

            if(tArray[i] == sArray[j]) {
                j++;
            }

            if(j >= sArray.length) {
                return true;  
            } 

        }

        return false;
    }
}