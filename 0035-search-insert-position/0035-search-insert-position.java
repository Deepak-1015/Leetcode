class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> li=new ArrayList<>();

        for(int i:nums){
            li.add(i);
        }
        int pos=Collections.binarySearch(li,target);

        if(pos<0){
            pos=-(pos+1);
        }
        return pos;
    }
}