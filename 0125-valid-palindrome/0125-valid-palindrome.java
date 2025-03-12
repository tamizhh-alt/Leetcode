class Solution {
    public boolean isPalindrome(String s) {
         String S = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            if((S.charAt(i)>='a' && S.charAt(i)<='z') || (S.charAt(i)>='0' && S.charAt(i)<='9')){
                sb.append(S.charAt(i));
            }
        }
        String filtered = sb.toString();
        String reversed = sb.reverse().toString();
        return filtered.equals(reversed);

        
    
    }
    
    
}