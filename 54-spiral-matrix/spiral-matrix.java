class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        int top = 0;
        int botton = m - 1;
        int left = 0;
        int right = n - 1;

        while (left <= right && top <= botton) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= botton; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= botton) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[botton][i]);
                }
                botton--;
            }
            if (left <= right) {
                for (int i = botton; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}