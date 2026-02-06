class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
            backtrack(li,"",0,0,n);
            return li;
    }
    public void backtrack(List<String>li,String crr,int op,int cl,int n){

        if(crr.length()==2*n){
            li.add(crr);
            return;
        }
        if(op<n){
            backtrack(li,crr+"(",op+1,cl,n);
        }
        if(cl<op){
            backtrack(li,crr+")",op,cl+1,n);
        }
    }
}