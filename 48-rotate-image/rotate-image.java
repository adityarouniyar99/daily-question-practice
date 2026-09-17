class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] result = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int k = (n-1)-i;
                result[j][k] = matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
}