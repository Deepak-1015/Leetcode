class Solution {
    public int countDigits(int num) {
        int count=0;

        int temp=num;
        while(num>0){
            int digi=num%10;

            if(temp%digi==0) count++;
            num/=10;
        }
        return count;
    }
}