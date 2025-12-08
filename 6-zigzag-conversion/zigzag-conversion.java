class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        String res="";
        int increment=(numRows-1)*2;
        for(int r=0;r<numRows;r++){
            for(int c=r;c<s.length();c+=increment){
                res+=s.charAt(c);
                if(r>0 && r<numRows-1 && c+increment-(2*r)<s.length()){
                    res+=s.charAt(c+increment-(2*r));
                }
            }
        }
        return res;
    }
}