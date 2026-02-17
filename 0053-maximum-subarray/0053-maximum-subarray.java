class Solution {
    public int maxSubArray(int[] nums) {
        int crr=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            crr=Math.max(nums[i],crr+nums[i]);

            max=Math.max(max,crr);
        }
        return max;
    }
}