class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();

        for(int i:nums1) a.add(i);
        for(int i:nums2) a.add(i);

        Collections.sort(a);

        int s=a.size();
        double med;

        if(s%2==0){
            med=(a.get(s/2)+a.get(s/2-1))/2.0;
        }
        else{
            med=a.get(s/2);
        }
        return med;
    }
}