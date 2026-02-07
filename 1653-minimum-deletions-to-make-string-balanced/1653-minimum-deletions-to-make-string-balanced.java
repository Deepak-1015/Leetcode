class Solution {
    public int minimumDeletions(String s) {
        int  a=0;
        int b=0;
        for(char c:s.toCharArray()){
            if(c=='b') a++;

            else if(a>0){
                a--;
                b++;
            }
        }
        return b;
    }
}