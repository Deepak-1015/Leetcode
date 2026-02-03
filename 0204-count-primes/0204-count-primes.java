class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        
        boolean[]f=new boolean[n];
        for(int i=0;i<n;i++){
            f[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(f[i]){
                for(int j=i*i;j<n;j+=i){
                    f[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(f[i]) count++;
        }
        return count;
    }
}