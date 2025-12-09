class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        int first =1;
        result.add(first);
        long res=1;
        for(int col=1;col<=rowIndex;col++){
            res=res*(rowIndex-col+1);
            res=res/col;
            result.add((int)res);
        }
        return result;
    }
}