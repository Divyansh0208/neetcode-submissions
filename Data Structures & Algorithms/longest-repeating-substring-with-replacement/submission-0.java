public class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> c = new HashMap<>();
            int m = 0;
            for (int j = i; j < s.length(); j++) {
                c.put(s.charAt(j), c.getOrDefault(s.charAt(j), 0) + 1);
                m = Math.max(m, c.get(s.charAt(j)));
                if ((j - i + 1) - m <= k) res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }
}