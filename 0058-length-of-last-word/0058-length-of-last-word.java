class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();

        int lastword=s.lastIndexOf(' ');
        String l=s.substring(lastword+1);

        return l.length();
    }
}