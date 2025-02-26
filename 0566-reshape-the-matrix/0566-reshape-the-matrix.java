class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n!=r*c){
            return mat;
        }

        int[][] arr = new int[r][c];
        for(int i=0; i<m*n; i++) {
            arr[i/c][i%c] = mat[i/n][i%n];
        }
        return arr;
    }
}
// class Solution {
//     public int[][] matrixReshape(int[][] mat, int r, int c) {
//         int originalRows = mat.length;
//         int originalCols = mat[0].length;
        
//         // Check if the reshape is possible
//         if (originalRows * originalCols != r * c) {
//             return mat;
//         }
        
//         int[][] reshaped = new int[r][c];
        
//         // Loop through all elements using a single loop
//         for (int i = 0; i < originalRows * originalCols; i++) {
//             // Map the index 'i' in the flattened view to the new matrix
//             reshaped[i / c][i % c] = mat[i / originalCols][i % originalCols];
//         }
        
//         return reshaped;
//     }
// }
