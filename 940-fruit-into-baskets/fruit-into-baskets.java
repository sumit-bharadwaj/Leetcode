class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.merge(fruits[right], 1, Integer::sum);

            while (map.size() > 2) {

                int count = map.get(fruits[left]) - 1;

                if (count == 0)
                    map.remove(fruits[left]);
                else
                    map.put(fruits[left], count);

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}