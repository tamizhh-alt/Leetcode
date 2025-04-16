class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        int total = 0;
        for(int i=0; i<ch1.length; i++){
            for(int j=0; j<ch2.length; j++){
                if(ch1[i] == ch2[j]){
                    total += Math.abs(i-j);
                }
            }
        }
        return total; 
    }
}