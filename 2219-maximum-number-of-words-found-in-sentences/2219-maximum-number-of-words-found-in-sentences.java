class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for (int i = 0; i < s.length; i++) {
            int sc = 0;
            for (char c : s[i].toCharArray()) {
                if (c == ' ') {
                    sc++;
                }
            }
            if (sc > max) {
                max = sc;
            }
        }
        return max + 1;

    }
}