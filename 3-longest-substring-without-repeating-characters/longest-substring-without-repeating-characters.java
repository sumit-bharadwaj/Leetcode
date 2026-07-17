import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int res = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            // Add current character
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Shrink window until all characters are unique
            while (map.size() < (high - low + 1)) {

                char left = s.charAt(low);

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                low++;
            }

            int len = high - low + 1;
            res = Math.max(res, len);
        }

        return res;
    }
}