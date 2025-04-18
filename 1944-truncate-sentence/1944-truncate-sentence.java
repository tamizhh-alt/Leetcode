class Solution {
    public String truncateSentence(String s, int k) {
        String S = "";

        String[] str = s.split(" ");
        for(int i=0; i<k; i++){
            S += str[i] + " ";
        }
         if (S != null && S.length() > 0 && S.charAt(S.length() - 1) == ' ') {  
            return S.substring(0, S.length() - 1);  
        } 
        return S;
    }
}