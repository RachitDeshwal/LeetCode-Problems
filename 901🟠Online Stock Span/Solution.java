class StockSpanner {
  Stack<int[]> s1;
  

  public StockSpanner() {
      s1=new Stack<>();
     
      
  }
  
  public int next(int price) {
      int days=1;
      while(!s1.isEmpty()&&price>=s1.peek()[0]){
          days+=s1.pop()[1];
      }
      s1.push(new int[]{price,days});
      return days;
      
      
  }
}