class Solution {
    public int fib(int n) {
      int result=0;
      int previous1=0;
      int previous2=1;
      if(n<=1){
        return n;
      }
      for(int i=1;i<n;i++){
            result=previous1+previous2;
            previous1=previous2;
            previous2=result;
      }
      return result;
    }
}