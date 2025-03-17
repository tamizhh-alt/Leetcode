class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        List<Integer> L = new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            int Rmin = mat[i][0];
            int minCIndex = 0;
            for(int j=1; j<mat[0].length; j++) {
                if(mat[i][j] < Rmin) {
                    Rmin = mat[i][j];
                    minCIndex = j;
                }
            }
            boolean isLucky = true;
            for(int k=0; k<mat.length; k++) {
                if(mat[k][minCIndex]>Rmin){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky) {
                L.add(Rmin);
            }
        }
        return L;
    }
}