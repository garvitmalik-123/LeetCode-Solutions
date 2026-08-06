import java.util.*;

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums) {

            int count = map.getOrDefault(i, 0);

            if(count < k) {
                list.add(i);
                map.put(i, count + 1);
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}