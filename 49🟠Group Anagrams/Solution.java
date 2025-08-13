class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String s1:strs){
        String freqStr=frequencyString(s1);
        if(map.containsKey(freqStr)){
            map.get(freqStr).add(s1);
        }
        else{
            List<String> list=new ArrayList<>();
            list.add(s1);
            map.put(freqStr,list);
        }

        }
        return new ArrayList<>(map.values());        

        
    }
    public static String frequencyString(String s1){
        int freq[]=new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        char c='a';
        StringBuilder sb=new StringBuilder();
        for(int i:freq){
            if(i>=1){
                sb.append(c);
                sb.append(i);
            }
            c++;
        }
        return sb.toString();
    }
}