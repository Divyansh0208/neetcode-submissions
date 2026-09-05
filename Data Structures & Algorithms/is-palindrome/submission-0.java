public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) st.append(Character.toLowerCase(c));
        }
        return st.toString().equals(st.reverse().toString());
    }
}