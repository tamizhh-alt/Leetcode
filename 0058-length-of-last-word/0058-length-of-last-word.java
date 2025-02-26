class Solution {
    public int lengthOfLastWord(String s) {
          String[] output = s.split(" ");
          int len=0;
        for(int i=output.length-1; i>output.length-2; i--){
            String words = output[i];
             len = words.length();
        }
    return len;
    }
}