class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        int n = nums.size();
        final TreeSet<Integer> set = new TreeSet<>();
        int ans = Integer.MAX_VALUE;
        for (int i = n - 1 - x; i >= 0; i--) {
            int indexAhead = i + x;
            set.add(nums.get(indexAhead));

            int element = nums.get(i);
            Integer min = set.lower(element + 1);
            Integer max = set.higher(element - 1);

            if (min != null)
                ans = Math.min(ans, Math.abs(min - element));

            if (max != null)
                ans = Math.min(ans, Math.abs(max - element));
        }
        return ans;
    }
}