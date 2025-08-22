class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m=s.length();
        int n=p.length();
        List<Integer> list =new ArrayList<>();
       int countp[]=new int[26];
       int counts[]=new int[26];
       for(int i=0;i<n;i++){
        countp[p.charAt(i)-'a']++;
       }
       for(int i=0;i<m;i++){
        char ch=s.charAt(i);
        counts[ch-'a']++;
        if(i>=n){
            counts[s.charAt(i-n)-'a']--;
        }
        if(Arrays.equals(countp,counts)){
            list.add(i-n+1);
        }
       }
       return list;
    }
}