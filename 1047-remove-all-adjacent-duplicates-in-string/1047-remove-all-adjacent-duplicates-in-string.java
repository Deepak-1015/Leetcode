class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!st.isEmpty() && s.charAt(i)== st.peek())
                st.pop();
            else
                st.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            char c = st.pop();
            res.append(c);
        }

        int j = res.length() - 1;
        for(int i = 0 ; i < res.length()/2 ; i++){
            char temp = res.charAt(i);
            res.setCharAt(i , res.charAt(j));
            res.setCharAt(j, temp);
            j--;
        }

        return res.toString();
    }
}
