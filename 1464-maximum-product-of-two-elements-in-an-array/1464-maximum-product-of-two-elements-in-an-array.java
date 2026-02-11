class Solution {
    public int maxProduct(int[] nums) {
        
        int ans=0;
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            ans=Math.max(ans,(max-1)*(nums[i]-1));
            max=Math.max(max,nums[i]);
        }
        return ans;
    }
}