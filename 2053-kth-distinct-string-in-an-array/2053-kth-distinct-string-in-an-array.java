class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        Map<String,Boolean> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],false);
            }
            else{
                hm.put(arr[i],true);
            }
        }
        for(String i:arr){
            if(hm.get(i)==true){
                count++;
                if(count==k){
                    return i;
                }
            }
        }
        return "";
    }
}