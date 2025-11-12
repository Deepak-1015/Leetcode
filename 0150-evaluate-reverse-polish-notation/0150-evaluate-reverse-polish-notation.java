class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> op=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
            int y=op.pop();
            int x=op.pop();
            op.push(x+y);
            }
            else if(s.equals("-")){
            int y=op.pop();
            int x=op.pop();
            op.push(x-y);
        }
        else if(s.equals("*")){
            int y=op.pop();
            int x=op.pop();
            op.push(x*y);
        }
        else if(s.equals("/")){
            int y=op.pop();
            int x=op.pop();
            op.push(x/y);
        }
        else{
            op.push(Integer.parseInt(s));
        }
    }
        return op.pop();
}
}