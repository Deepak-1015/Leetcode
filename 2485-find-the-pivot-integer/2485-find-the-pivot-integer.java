class Solution {
    public int pivotInteger(int n) {
        int pi=n*(n+1)/2;
        int x=(int)Math.sqrt(pi);
        if(x*x==pi) return x;

        return -1;

    }
}