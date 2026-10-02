

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        ans.add("");

        for (int i = 0; i < 2 * n; i++) {

            List<String> next = new ArrayList<>();

            for (String str : ans) {

                int open = 0;
                int close = 0;

                for (char ch : str.toCharArray()) {
                    if (ch == '(')
                        open++;
                    else
                        close++;
                }

                if (open < n) {
                    next.add(str + "(");
                }

                if (close < open) {
                    next.add(str + ")");
                }
            }

            ans = next;
        }

        return ans;
    }
}