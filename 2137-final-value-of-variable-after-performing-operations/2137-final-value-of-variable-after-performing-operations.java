class Solution {
    public int finalValueAfterOperations(String[] o) {
        int sum = 0;
        for(int i=0; i<o.length; i++){

            if(o[i].equals("--X") || o[i].equals("X--")) sum--;
            if(o[i].equals("++X") || o[i].equals("X++")) sum++;
            //  return sum;
        }
        return sum;
    }
}