class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
//BRUTE FORCE
        // for(int i=0;i<numRows;i++){
        //     List<Integer> row = new ArrayList<>();

        //     row.add(1);

        //     int j = 1;
        //     while(j<i){
        //         int value = result.get(i-1).get(j-1) + 
        //                     result.get(i-1).get(j);
        //         j++;
        //         row.add(value);
        //     }

        //     if(i>0){
        //         row.add(1);
        //     }

        //     result.add(row);
        // }   
        // return result;

// OPTIMAL SOLUTION
        for(int row=1;row<=numRows;row++){
            List<Integer> row1 = new ArrayList<>();

            for(int col=1;col<=row;col++){
                row1.add((funNCR(row-1,col-1)));
            }
            result.add(row1);
        }
        return result;
    }

    public int funNCR(int n,int r){
        int res = 1;
        for(int i=1;i<=r;i++){
            res = res*(n-i+1)/i;
        }
        return res;
    }
}