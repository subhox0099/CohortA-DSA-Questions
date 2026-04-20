class Solution {
    public int minPatches(int[] nums, int n) {
        long maxrch = 1;
        int i = 0;
        int patches = 0;

        while (maxrch <= n) {
            if (i < nums.length && nums[i] <= maxrch) {
                maxrch += nums[i];
                i++;
            } else {
                maxrch += maxrch;
                patches++;
            }
        }

        return patches;
    }
}