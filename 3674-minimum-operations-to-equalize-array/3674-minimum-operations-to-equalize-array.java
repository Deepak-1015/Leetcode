class Solution {
    public int minOperations(int[] nums) {
        boolean f=true;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[0]){
                f=false;
                break;
            }
        }
        if(f) return 0;
        return 1;
    }
}