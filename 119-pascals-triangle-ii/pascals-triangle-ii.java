class Solution {
    public long funNCR(int n, int r) {
        long res = 1;

        for (int i = 1; i <=r; i++) {
            res = res * (n - i + 1) / i;
        }

        return res;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for (int c = 0; c <= rowIndex; c++) {
            result.add((int)funNCR(rowIndex,c));
        }
        return result;
    }
}