class Solution {
    public String removeDuplicateLetters(String s) {
       Map<Character,Integer> map=new HashMap<>();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       Stack<Character> s1=new Stack<>();
       Set<Character> visited=new HashSet<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.get(ch)-1);
        if(visited.contains(ch)){
            continue;
        }
        while(!s1.isEmpty()&&ch<s1.peek()&&map.get(s1.peek())>0){
            visited.remove(s1.pop());
        }
        visited.add(ch);
        s1.push(ch);
       
        }
        for(char c:s1){
            sb.append(c);
        }
       return sb.toString();

       }
       
    }
    
