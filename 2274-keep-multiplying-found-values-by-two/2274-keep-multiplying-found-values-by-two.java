class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        int bit=0;
        for(int n:nums){
            if(n%original!=0) continue;
            int v=n/original;

            if((v&(v-1))==0) bit|=v;
        }
        int val=bit+1;
        return original*(val&-val);
    }
}