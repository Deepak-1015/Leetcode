class Solution {
    public int reverseBits(int n) {
        String bin=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<32-bin.length();i++){
            sb.append('0');
        }
        sb.append(bin);
        sb.reverse();

        return (int) Long.parseLong(sb.toString(),2);
    }
}