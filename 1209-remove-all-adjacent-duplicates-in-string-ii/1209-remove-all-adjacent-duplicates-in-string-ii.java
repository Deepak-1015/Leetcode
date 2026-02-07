class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!st.isEmpty() && st.peek()[0] == ch) {
                st.peek()[1]++;

                if (st.peek()[1] == k) {
                    st.pop();
                }
            } else {
                st.push(new int[] { ch, 1 });
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < st.size(); i++) {

            int[] pair = st.get(i);
            char ch = (char) pair[0];
            int count = pair[1];

            for (int j = 0; j < count; j++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}