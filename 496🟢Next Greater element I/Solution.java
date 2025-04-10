class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int []nextGreater=new int[nums1.length];
      findNextGreater(map,nums2);
      
      for(int i=0;i<nums1.length;i++){
          nextGreater[i]=map.get(nums1[i]);

      }
      return nextGreater;
      
  }
  public void findNextGreater(HashMap<Integer,Integer> map,int[] nums2){
      Stack <Integer> s=new Stack<>();
      for(int i=nums2.length-1;i>=0;i--){
          int element=nums2[i];
          while(!s.isEmpty()&&s.peek()<=element){
              s.pop();
          }
          if(s.isEmpty()){
              map.put(element,-1);
              s.push(element);
              continue;
          }
          if(!s.isEmpty()&&element<s.peek()){
              map.put(element,s.peek());
              s.push(element);
          }
      }

  }
}