class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length+nums.length;
        int[]arr=new int[n];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length;i<n;i++){
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}