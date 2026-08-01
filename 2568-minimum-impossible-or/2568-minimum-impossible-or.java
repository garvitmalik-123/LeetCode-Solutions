class Solution {
    public int minImpossibleOR(int[] nums) {
        boolean[] present = new boolean[31];

        for (int num : nums) {
            if ((num & (num - 1)) == 0) { 
                int bit = Integer.numberOfTrailingZeros(num);
                present[bit] = true;
            }
        }

        int ans = 1;
        while (present[Integer.numberOfTrailingZeros(ans)]) {
            ans <<= 1;
        }

        return ans;
    }
}