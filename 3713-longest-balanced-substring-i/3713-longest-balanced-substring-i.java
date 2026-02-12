class Solution {
    public int longestBalanced(String s) {
        int maxlen=0;

        for(int i=0;i<s.length();i++){
            int[]frq=new int[26];

            int uni=0;
            int max=0;

            for(int j=i;j<s.length();j++){
                int ind=s.charAt(j)-'a';

                if(frq[ind]==0){
                    uni++;
                }
                frq[ind]++;
                max=Math.max(max,frq[ind]);

                int len=j-i+1;

                if(len==uni*max){
                    maxlen=Math.max(maxlen,len);
                }
            }
        }
        return maxlen;
    }
}