class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[]arr=new boolean[nums.length+1];
        for(int i:nums){
            arr[i]=true;
        }
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==false){
                ar.add(i);
            }
        }
        return ar;
    }
}