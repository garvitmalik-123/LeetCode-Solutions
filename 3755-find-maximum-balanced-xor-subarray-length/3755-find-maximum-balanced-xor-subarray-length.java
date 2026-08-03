class Solution {
    public int maxBalancedSubarray(int[] nums) {
        HashMap<String, Integer> map = new HashMap<>();

        int xor = 0;
        int balance = 0;
        int ans = 0;

        map.put("0#0", -1);

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];

            if ((nums[i] & 1) == 0)
                balance++;
            else
                balance--;

            String key = xor + "#" + balance;

            if (map.containsKey(key)) {
                ans = Math.max(ans, i - map.get(key));
            } else {
                map.put(key, i);
            }
        }

        return ans;
    }
}