class Solution {
    public boolean hasAllCodes(String s, int k) {
        int t=1<<k;
        Set<String> hs=new HashSet<>();

        for(int i=k;i<=s.length();i++){
            String sub=s.substring(i-k,i);

            if(!hs.contains(sub)){
                hs.add(sub);
            }
        }
        if(hs.size()==t) return true;

        return false;
    }
}