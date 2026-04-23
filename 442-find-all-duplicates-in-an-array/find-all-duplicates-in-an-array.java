class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] seen = new boolean[nums.length + 1];

        for (int num : nums) {
            if (seen[num]) {
                res.add(num);
            }
            seen[num] = true;
        }
        return res;
    }
}