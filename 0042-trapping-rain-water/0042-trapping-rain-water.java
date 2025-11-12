class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int st=0;
        int ed=n-1;
        int lb=height[st];
        int rb=height[ed];
        int val=0;
        while(st<=ed){
            if(lb<=rb){
                lb=Math.max(lb,height[st]);
                val+=lb-height[st];
                st++;
            }
            else{
                rb=Math.max(rb,height[ed]);
                val+=rb-height[ed];
                ed--;
            }
        }
         return val;
    }
}