class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[nums.length];
        int l=0,r=1;
        for(int i=0;i<n;i++){
            arr[l]=nums[i];
            arr[r]=nums[n+i];
            l=l+2;
            r=r+2;
        }
        return arr;
    }
}