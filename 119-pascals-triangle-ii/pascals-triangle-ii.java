class Solution {

// =====================BRUTE FORCE =================================
    // public long funNCR(int n, int r) {
    //     // here  n is row and r is column
    //     long res = 1;

    //     for (int i = 1; i <=r; i++) {
    //         res = res * (n - i + 1) / i;
    //     }

    //     return res;
    // }
//====================================================================
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

// BRUTE FORCE SOLUTION
        // for (int c = 0; c <= rowIndex; c++) {
        //     result.add((int)funNCR(rowIndex,c));
        // }
        // return result;


// =======================BETTER============================================

        long current = 1;
        result.add((int)current);
        for(int i=1;i<=rowIndex;i++){
            current = current * (rowIndex-i+1)/i;
            result.add((int)current);
        }

        return result;
    }
}