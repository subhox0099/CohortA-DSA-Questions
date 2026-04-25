class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxsum = Integer.MIN_VALUE, sum = 0;
        int minsum = Integer.MAX_VALUE, min = 0;

        for (int num : nums) {
         
            sum += num;
            maxsum = Math.max(maxsum, sum);
            if (sum < 0) sum = 0;

         
            min += num;
            minsum = Math.min(minsum, min);
            if (min > 0) min = 0;

            total += num;
        }

        if (maxsum < 0) return maxsum;

        return Math.max(maxsum, total - minsum);
    }
}