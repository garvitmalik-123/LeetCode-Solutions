class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int left = 0;
        int right = n;
        int[] ans = new int[n + 1];
        int index = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'I') {
                ans[index++] = left++;
            } else {
                ans[index++] = right--;
            }
        }

        ans[index] = left;
        return ans;
    }
}