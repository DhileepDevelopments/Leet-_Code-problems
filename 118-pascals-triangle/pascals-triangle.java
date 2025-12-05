class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List <Integer>> pascal=new ArrayList(); 
        
        for(int i=0;i<numRows;i++)
        {
            List<Integer> Rows=new ArrayList();

            for(int j=0;j<=i;j++){
                if(j==i||j==0){
                    Rows.add(1);
                }else{
                    List<Integer> PreviousRow=pascal.get(i-1);
                    Rows.add(PreviousRow.get(j) + PreviousRow.get(j-1));
                }
            }
            pascal.add(Rows);
        }
        return pascal;
    }
}