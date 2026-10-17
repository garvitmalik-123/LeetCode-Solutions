class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++)
            a[i] = new int[]{digitSum(nums[i]), nums[i]};

        Arrays.sort(a, (x, y) ->
            x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(a[i][1], i);

        boolean[] vis = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;

            int j = i, count = 0;
            while (!vis[j]) {
                vis[j] = true;
                j = map.get(nums[j]);
                count++;
            }
            ans += Math.max(0, count - 1);
        }
        return ans;
    }

    int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
