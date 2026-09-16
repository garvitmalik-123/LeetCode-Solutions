class Solution {
    static final int MOD = 1000000007;

    public int numberOfSets(int n, int k) {
        long[][] dp = new long[n + k][2 * k + 1];

        dp[0][0] = 1;

        for (int i = 1; i < n + k; i++) {
            for (int j = 0; j <= 2 * k; j++) {

                dp[i][j] = dp[i - 1][j];

                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                }
            }
        }

        return (int) dp[n + k - 1][2 * k];
    }
}