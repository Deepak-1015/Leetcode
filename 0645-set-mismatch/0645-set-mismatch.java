class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]frq=new int[nums.length+1];
        int[]arr=new int[2];

        for(int i:nums){
            frq[i]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(frq[i]==2) arr[0]=i;
            if(frq[i]==0) arr[1]=i;
        }
        return arr;
    }
}