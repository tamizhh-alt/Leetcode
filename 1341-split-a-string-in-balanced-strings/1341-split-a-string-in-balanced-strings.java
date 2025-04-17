class Solution {
    public int balancedStringSplit(String s) {
        int l = 0;
        List<Integer> list = new ArrayList<>();

        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'L') l++;
            else l--;
            if(l==0) list.add(0);
        }

    return list.size();
    }
}