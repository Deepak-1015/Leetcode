class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutate(nums,0,res);
        return res;
    }
    public void permutate(int[]nums,int ind,List<List<Integer>> res){
        if(ind==nums.length){
            List<Integer> ar=new ArrayList<>();
            for(int n:nums){
                ar.add(n);
            }
            res.add(ar);
            return;
        }
        Set<Integer> hs=new HashSet<>();
        for(int i=ind;i<nums.length;i++){
            if(hs.contains(nums[i])) continue;
            hs.add(nums[i]);

            swap(nums,i,ind);
            permutate(nums,ind+1,res);
            swap(nums,i,ind);
        }
    }
    public void swap(int[]nums , int i , int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}