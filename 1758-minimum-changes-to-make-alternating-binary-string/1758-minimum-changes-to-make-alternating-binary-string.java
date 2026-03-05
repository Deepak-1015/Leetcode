class Solution {
    public int minOperations(String s) {
        int c1=0;
        int c2=0;

        for(int i=0;i<s.length();i++){
            char ex1;
            char ex2;
            
            if(i%2==0){
                ex1='0';
            }
            else{
                ex1='1';
            }
            if(i%2==0){
                ex2='1';
            }
            else{
                ex2='0';
            }
            if(s.charAt(i)!=ex1) c1++;
            if(s.charAt(i)!=ex2) c2++;                    
        }
        return Math.min(c1,c2);
    }
}