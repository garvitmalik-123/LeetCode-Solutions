
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long[] freq = new long[100001];
        long total = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            total += diff;
        }

        long k = (long) k1 + k2;

        if (total <= k) {
            return 0;
        }

        for (int d = 100000; d > 0 && k > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }

            long count = Math.min(freq[d], k);
            freq[d] -= count;
            freq[d - 1] += count;
            k -= count;
        }

        long ans = 0;

        for (int d = 1; d <= 100000; d++) {
            ans += freq[d] * d * d;
        }

        return ans;
    }
}
