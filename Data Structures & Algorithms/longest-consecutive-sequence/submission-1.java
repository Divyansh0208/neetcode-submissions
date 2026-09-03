public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        int res = 0;
        for (int num : store) { // iterate over set to avoid duplicates
            // Only start if this is the beginning of a sequence
            if (!store.contains(num - 1)) {
                int curr = num;
                int streak = 1;

                while (store.contains(curr + 1)) {
                    curr++;
                    streak++;
                }

                res = Math.max(res, streak);
            }
        }

        return res;
    }
}