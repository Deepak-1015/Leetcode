class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[]frq=new int[10001];

        for(int i=0;i<deck.length;i++){
            frq[deck[i]]++;
        }
        int gcd=0;
        for(int i:frq){
            if(i>0){
                gcd=GCD(gcd,i);
            }
        }
        return gcd>1;
    }
    public int GCD(int a,int b){
        if(a==0) return b;
        return GCD(b%a,a);
    }
}