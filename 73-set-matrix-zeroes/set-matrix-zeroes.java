class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

    //     if (matrix==null ||matrix.length <= 1 || matrix[0].length <= 1 ) {
    //         return;
    //     }

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 markRow(i, matrix, n);
    //                 markCol(j, matrix, m);
    //             }
    //         }
    //     }

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == -1) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    // public void markRow(int i, int[][] matrix, int n) {
    //     for (int j = 0; j < n; j++) {
    //         if (matrix[i][j] != 0) {
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }

    // public void markCol(int j, int[][] matrix, int m) {
    //     for (int i = 0; i < m; i++) {
    //         if (matrix[i][j] != 0) {
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }

    boolean[] row = new boolean[m];
    boolean[] col = new boolean[n];

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                row[i] = true;
                col[j] = true;
            }
        }
    }

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(row[i] || col[j] ){
                matrix[i][j] = 0;
            }
        }
    }

    }
}