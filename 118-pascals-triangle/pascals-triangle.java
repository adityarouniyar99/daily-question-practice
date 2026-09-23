class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();

            row.add(1);

            int j = 1;
            while(j<i){
                int value = result.get(i-1).get(j-1) + 
                            result.get(i-1).get(j);
                j++;
                row.add(value);
            }

            if(i>0){
                row.add(1);
            }

            result.add(row);
        }   
        return result;
    }
}