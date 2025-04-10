class Solution {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        int[] arr = new int[str.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        String[] s = new String[arr.length];
        for(int i=0; i<s.length; i++) {
            s[i] = Integer.toBinaryString(arr[i]);
        }

        String S = "";
        for(int i=0; i<s.length; i++) {
            S += s[i] + "-";
        }

        String result = S.substring(0,S.length()-1);

        return result;
    }
}